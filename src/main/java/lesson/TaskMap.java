package lesson;


import java.util.HashMap;
import java.util.Map;

public class TaskMap {
    public static void main(String[] args) {
        String text = "exampletext"; // или твоя строка
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);

            if (map.containsKey(temp)) {
                Integer value = map.get(temp);
                int newValue = value + 1;
                map.put(temp, newValue);
            } else {
                map.put(temp, 1);
            }
        }

        System.out.println(map);
    }
}

