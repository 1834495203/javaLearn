package orgin.stream;

import java.util.ArrayList;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(23);
        list.stream().filter(l -> l > 15).toList().forEach(System.out::println);
        System.out.println(list.stream().mapToInt(l -> l).sum());
    }
}
