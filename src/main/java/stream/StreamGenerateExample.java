package stream;

import java.util.Date;
import java.util.stream.Stream;

public class StreamGenerateExample {
    public static void main(String[] args) {
        Stream<Date> stream = Stream.generate(() -> {return new Date();
        });

        stream.forEach(date -> System.out.println(date));
    }
}
