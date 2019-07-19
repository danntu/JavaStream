package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(integer -> integer % 2 == 0).toArray(Integer[]::new);
        System.out.println(evenNumbersArr);
    }
}
