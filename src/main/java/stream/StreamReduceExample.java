package stream;

import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        Optional<String> reduce = StreamFilterExample.loadListString()
                .stream()
                .reduce((s1, s2) -> s1 + "#" + s2);
        reduce.ifPresent(System.out::println);
    }
}
