package orgin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class List {

    private static final int[] A = {10 ,20, 40};

    public static void main(String[] args) {
        List.learnString();
    }

    public static void learnList(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        System.out.println(map.get(1));
    }

    public static void learnString(){

        String str = "abc";
        String substring = str.substring(1);

        System.out.println(substring);
        byte[] bytes = str.getBytes();
        System.out.println(new String(bytes));

        A[0] = 90;
        System.out.println(A[1]);
    }

    public static void learnSystem(){
        long time = System.currentTimeMillis();
        Date date = new Date(time);
        System.out.println(date);
    }


    public static class NewWorld{
    }
}
