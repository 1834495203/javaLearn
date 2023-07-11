package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class Ok {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(new Ok().mix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        TreeMap<String, String> asd = new TreeMap<>();
    }

    public int[] mix(int[] arr){
        int[] is = new int[arr.length];
        int i, len = arr.length, k = 0;
        while (len > 0){
            i = new Random().nextInt(10);
            if (arr[i] != -1){
                is[k++] = arr[i];
                arr[i] = -1;
                len--;
            }
        }
        return is;
    }

    public boolean testNumber(int num){
        if (num <= 0) return false;
        double i = num;
        while((i = i/2.0) != 1){
            if (i > (int) i)
                return false;
        }
        return true;
    }


    public <T> void testSort(T sort, Class<T> tClass) throws Exception {
        T instance = tClass.getDeclaredConstructor().newInstance();

    }


    static class Bucket{
        private Object object;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }
    }

    static class Test{
        public static void main(String[] args) {
            Bucket appleBucket = new Bucket();
            appleBucket.setObject(Apple.apple);
            Bucket eggBucket = new Bucket();
            eggBucket.setObject(Egg.egg);

            Object apple = appleBucket.getObject();
            Object egg = eggBucket.getObject();

            appleBucket.setObject(egg);
            eggBucket.setObject(apple);

        }
    }
}

class Apple {
    public static final Object apple = new Object();
}

class Egg {
    public static final Object egg = new Object();
}
