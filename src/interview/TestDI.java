package interview;

import java.lang.reflect.Field;
import java.util.Locale;

/**
 * @author GLaDOS
 * @date 2023/5/7 23:44
 */
public class TestDI {

    private static final int[] i = new int[]{1, 2};

    public static void main(String[] args) throws Exception {
        i[0] = 999;
        System.out.println(i[0]);
        Integer t = 999;
        new TestDI().test(t);
        System.out.println(t);
    }

    public <T, S> T tst(Class<? extends T> var1, Class<? extends S> var2) throws Exception {
        T t = var1.getDeclaredConstructor().newInstance();
        S s = var2.getDeclaredConstructor().newInstance();

        Field dft = var1.getDeclaredField(var2.getName().split("\\.")[1].toLowerCase(Locale.ROOT));
        Field dfs = var2.getDeclaredField(var1.getName().split("\\.")[1].toLowerCase(Locale.ROOT));

        dft.setAccessible(true);
        dfs.setAccessible(true);

        dft.set(t, s);
        dfs.set(s, t);
        return t;
    }

    public void test(Integer a){
        a = 999;
    }
}

class A {

    private static final String NAME = "I am A";

    private B b;

    public A() {
    }

    public A (B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public String getDI(){
        return NAME;
    }
}

class B {

    private static final String NAME = "I am B";

    private A a;

    public B() {
    }

    public B (A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public String getDI(){
        return NAME;
    }
}
