import java.util.ArrayList;

public class day10 {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for(String l: list) {
            System.out.print(l);
        }
        list.remove("C");
        System.out.println();
         for (String l: list) {
            System.out.print(l);
        }
    }
        }


