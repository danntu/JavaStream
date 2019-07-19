package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList);
    }
}
