package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders {
    public static void main(String[] args) {
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(value -> System.out.println(value));

        Stream<String> stream1 =  Stream.of("A$B$C".split("\\$"));
        stream1.forEach(s -> System.out.println(s));
    }
}
