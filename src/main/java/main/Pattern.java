package main;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern {
    public static void main(String[] args) {
        String regEx1 = "www.*"; // Регулярное выражение
        String str = "www.telran-de, www.google.com"; // Входная строка

        // Компилируем шаблон регулярного выражения
        Pattern pattern = Pattern.compile(regEx1);

        // Создаём объект Matcher, который будет искать совпадения в строке
        Matcher matcher = pattern.matcher(str);

        // Проверяем, соответствует ли вся строка шаблону
        System.out.println("www -> " + matcher.matches());

        // Если есть совпадение, выводим индексы начала и конца найденного фрагмента
        if (matcher.find()) {
            System.out.println("www -> " + matcher.start() + " -- " + matcher.end());
        }
    }
}


