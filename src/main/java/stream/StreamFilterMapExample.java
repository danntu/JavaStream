package stream;

public class StreamFilterMapExample {
    public static void main(String[] args) {
        StreamFilterExample.loadListString()
                .stream().filter(s -> s.startsWith("D"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
