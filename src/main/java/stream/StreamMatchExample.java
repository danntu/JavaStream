package stream;

public class StreamMatchExample {
    public static void main(String[] args) {
        boolean matchedResult = StreamFilterExample.loadListString()
                .stream()
                .anyMatch(s -> s.startsWith("D"));
        System.out.println(matchedResult);

        matchedResult = StreamFilterExample.loadListString()
                .stream()
                .allMatch(s -> s.startsWith("D"));
        System.out.println(matchedResult);

        matchedResult = StreamFilterExample.loadListString()
                .stream()
                .noneMatch(s -> s.startsWith("Y"));
        System.out.println(matchedResult);
    }
}
