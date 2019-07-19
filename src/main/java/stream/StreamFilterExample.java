package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        loadListString().stream().filter(s -> s.startsWith("D"))
                .forEach(System.out::println);

    }

    public static List<String> loadListString(){
        List<String> membersName = new ArrayList<>();
        membersName.add("Daniyar");
        membersName.add("Daulet");
        membersName.add("Dauren");
        membersName.add("Estai");
        membersName.add("Marat");
        membersName.add("Nurlan");
        membersName.add("Aset");
        membersName.add("Zhanibek");
        return membersName;
    }
}
