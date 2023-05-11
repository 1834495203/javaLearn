package gof.kaibi;

import gof.kaibi.skin.DefaultSkin;
import gof.kaibi.skin.NewSkin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Clint {
    public static void main(String[] args) {
        Software software = new Software();
        //默认皮肤
        AbstractSkin skin = new DefaultSkin();
        //新皮肤
        NewSkin newSkin = new NewSkin();

        software.setAbstractSkin(skin);
        software.setAbstractSkin(newSkin);
        software.display();

        try {
            get("abc", 123, skin);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @SafeVarargs
    public static <T> void get(T... vars) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println(vars.length);
        @SuppressWarnings("all")
        T o = (T) vars[2].getClass().newInstance();
        Method display = o.getClass().getDeclaredMethod("display");
        display.invoke(o);
    }
}
