package lesson;
import java.util.Set;
import java.util.TreeSet;

public class TaskOne {
    public static void main(String[] args) {
        String str = "sjkdfkdshdskghdfkdslkjmsdcdksfsdfc";

        Set<Character> set = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            set.add(c);
        }
        System.out.println(set);

    }


}

//
//public static void main(String[] args) {
//    String str = "sjkdfkdshdskghdfkdslkjmsdcdksfsdfc";
//
//    Set<Character> set = new TreeSet<>();
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        set.add(ch);
//    }
//
//    for (Character ch : set) {
//        System.out.println("ch = " + ch);
//    }
//
//}