package stream;

public class StreamCountExample {
    public static void main(String[] args) {
        long count = StreamFilterExample.loadListString()
                .stream()
                .filter(s -> s.startsWith("D"))
                .count();
        System.out.println(count);
    }
}
