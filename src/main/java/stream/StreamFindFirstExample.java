package stream;

public class StreamFindFirstExample {
    public static void main(String[] args) {
        String firstMatched = StreamFilterExample.loadListString()
                .stream()
                .filter(s -> s.startsWith("D"))
                .findFirst()
                .get();
        System.out.println(firstMatched);
    }
}
