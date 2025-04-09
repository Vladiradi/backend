package lesson;
import java.util.HashMap;
import java.util.Map;


public class Task {
    public static void main(String[] args) {
        String text = "sdfsdfsdgksdgkjdhgkjsdhgksjhfksfjkslfslgsdgljsklghslk";
        Map<Character, Integer> letter = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);


            if (Character.isLetter(ch)) {

                if (letter.containsKey(ch)) {
                    int count = letter.get(ch);
                    letter.put(ch, count + 1);
                } else {
                    letter.put(ch, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : letter.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}



//
//

//
//
//    Map<Character, Integer> letterCount = new HashMap<>();
//
//    for (char ch : text.toCharArray()) {
//        if (Character.isLetter(ch)) {
//            letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
//        }
//    }
//
//    for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
//        System.out.println(entry.getKey() + " - " + entry.getValue());
//    }
