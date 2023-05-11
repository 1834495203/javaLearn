package orgin;

import orgin.Project.Person;
import orgin.entity.World;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.Objects;
import java.util.Optional;

public class Test {

    public static void main(String[] args) throws Exception {
        EdDSATest("zhanghan1123");
        EdDSATest("1123850107");
    }

    public void getAnnotation(Class<? extends World> clazz) throws Exception {
        Field[] fields = clazz.getDeclaredFields();
        World world = clazz.getDeclaredConstructor().newInstance();
        for (Field f : fields) {
            Value annotation = f.getAnnotation(Value.class);
            f.set(world, annotation.value());
            System.out.println(f.get(world));
        }
    }

    public void settle(Object var) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<?> aClass = var.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            char[] chars = declaredField.getName().toCharArray();
            String upper = getUpper(chars);
            Method declaredMethod = aClass.getDeclaredMethod("set" + upper, declaredField.getType());
            Value annotation = declaredField.getAnnotation(Value.class);
            if (declaredField.getType().toString().equals("int"))
                declaredMethod.invoke(var, Integer.parseInt(annotation.value()));
            else declaredMethod.invoke(var, annotation.value());
        }
    }

    private static String getUpper(char[] var){
        var[0] = (char) (var[0]-'a'+'A');
        return String.valueOf(var);
    }

    private static <T> T getBean(Class<T> clazz) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        T var = clazz.getDeclaredConstructor().newInstance();
        new Test().settle(var);
        return var;
    }

    private static Optional<Person> getPerson(String name){
        if (Objects.equals(name, "")) return Optional.empty();
        return Optional.of(new Person());
    }

    /**
     * EdDSA (Edwards-Curve Digital Signature Algorithm)
     * 是在 Java 15 中通过JEP 339添加的另一种附加数字签名方案。
     * 与其他可用的签名方案相比，它提供了更好的性能和安全的签名。
     */
    private static void EdDSATest(String password) throws Exception {
        //生成密钥对
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("Ed25519");
        KeyPair kp = kpg.generateKeyPair();

        //使用Ed25519签名
        Signature sig = Signature.getInstance("Ed25519");

        //加密
        sig.initSign(kp.getPrivate());
        byte[] re = password.getBytes(StandardCharsets.UTF_8);
        sig.update(re);
        byte[] s = sig.sign();

        String encodedString = Base64.getEncoder().encodeToString(s);
        System.out.println(encodedString);

        //验证密钥
        sig.initVerify(kp.getPublic());
        sig.update(re);
        boolean verify = sig.verify(s);
        if (verify) System.out.println("正确");
        else System.out.println("错误");
    }
}
