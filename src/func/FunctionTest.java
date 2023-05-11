package func;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.*;

public class FunctionTest {
    public static void main(String[] args) throws Exception {
        Integer[] ints = {4, 2, 6, 1, 7, 3};
        Double[] doubles = {1.2, 5.6, 3.2, 9.8, 3.4, 7.6};
        FunctionTest t = new FunctionTest();
        t.testFunc(ints, (x, y) -> x.compareTo(y) > 0);
        t.testFunc(doubles, (x, y) -> x.compareTo(y) > 0);
        Arrays.stream(ints).forEach(i -> System.out.print(i+" "));
        Arrays.stream(doubles).forEach(d -> System.out.print(d+" "));

        User user = new User();
        user.setUsername("Marias");
        FunctionTest.testT(user::getUsername);
    }

    public static void testPredicate(){
        Predicate<String> pre = s -> s.contains("991");
        System.out.println(pre.test("9919991"));
        System.out.println(pre.test("9119991"));
    }

    public static <T> void testPre(Predicate<T> pre, T t){
        System.out.println(pre.test(t));
    }

    public static void testConsumer(){
        Consumer<String> consumer = System.out::println;
        consumer.accept("123");
    }

    public static void testCon(Consumer<String> consumer, String s){
        consumer.accept(s);
    }

    public static void testFunction(){
        Function<String, Integer> function = Integer::valueOf;
        Integer apply = function.apply("123");
        System.out.println(apply);

        BiFunction<Integer, Integer, Integer> func = Integer::sum;
        Integer sum = func.apply(1, 3);
    }

    public <T extends Comparable<T>> void testFunc(T[] t, BiPredicate<T, T> pre){
        for (int i = 0; i < t.length; i++) {
            for (int j = i; j < t.length; j++) {
                if (pre.test(t[i], t[j])){
                    T temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }

    }

    public static void testSupplier(){
        Supplier<String> stringSupplier = ()-> "asd";
        stringSupplier.get();
    }

    public static <T> void testT(Supplier<T> c){
        Arrays.stream(c.getClass().getDeclaredFields()).forEach(s -> System.out.println(s.getType()));
    }
}
