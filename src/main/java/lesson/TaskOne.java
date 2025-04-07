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
        int index = 1;
        for (Character c : set)  {
            System.out.println(index + ":   " + c);
            index++;
        }
    }
}

