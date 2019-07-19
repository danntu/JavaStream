package stream;

public class SreamSortedExample {
    public static void main(String[] args) {
        StreamFilterExample.loadListString()
                .stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
