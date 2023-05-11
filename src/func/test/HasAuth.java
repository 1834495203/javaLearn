package func.test;

import java.lang.reflect.Field;
import java.util.Arrays;

public class HasAuth <T>{

    private final String userAuth;

    private final T entity;

    private final Class<T> clazz;

    public HasAuth(String userAuth, T entity, Class<T> clazz) {
        this.userAuth = userAuth;
        this.entity = entity;
        this.clazz = clazz;
    }

    public T afterAuth(){
        try{
            T instance = clazz.getDeclaredConstructor().newInstance();
            String superAuth = null;
            String[] exclude = {};
            Auth superAnnotation;
            if ((superAnnotation = entity.getClass().getAnnotation(Auth.class)) != null){
                superAuth = superAnnotation.auth();
                exclude = superAnnotation.exclude();
            }
            for (Field df : entity.getClass().getDeclaredFields()) {
                df.setAccessible(true);
                Auth annotation = df.getAnnotation(Auth.class);
                Field newDf = instance.getClass().getDeclaredField(df.getName());
                newDf.setAccessible(true);
                if (annotation == null) newDf.set(instance, df.get(entity));
                else if (userAuth.contains(annotation.auth()) ||
                        superAuth != null && userAuth.contains(superAuth) &&
                                !isContains(df.getName(), exclude))
                    newDf.set(instance, df.get(entity));
            }
            return instance;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private boolean isContains(String s, String[] arr) {
        return Arrays.asList(arr).contains(s);
    }
}
