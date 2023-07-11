package interview;

import java.util.Arrays;

public class MyTest {

    public static void main(String[] args) {
        String[] str = {"1", "2", "3"};
        StringBuffer sb = new StringBuffer();
        Arrays.stream(str).forEach(sb::append);
        System.out.println(sb);
    }
}
