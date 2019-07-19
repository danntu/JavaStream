package stream;

public class StreamForEachExample {
    public static void main(String[] args) {
        StreamFilterExample.loadListString()
                .forEach(System.out::println);
    }
}
