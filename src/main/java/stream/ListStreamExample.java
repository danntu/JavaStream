package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i<10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(integer -> System.out.println(integer));
    }
}
