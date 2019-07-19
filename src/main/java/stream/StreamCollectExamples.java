package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExamples {
    public static void main(String[] args) {
        List<String> collect = StreamFilterExample.loadListString()
                .stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
