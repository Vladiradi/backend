package lesson;
//Разбить текст на слова с помощью шаблона регулярного выражения и расчитать
//словарь встречающихся слов для этого текста
//        (подсчитать количество одинаковых слов, встречающихся в этом тексте).
import java.util.*;
import java.util.regex.*;

public class WordCounter {

    public static Map<String, Integer> countWords(String text) {
        Pattern wordPattern = Pattern.compile("\\b\\w+\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = wordPattern.matcher(text);

        Map<String, Integer> wordCount = new HashMap<>();

        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to analyze:");
        String text = scanner.nextLine();

        Map<String, Integer> words = countWords(text);

        System.out.println("\nWord frequency:");
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}