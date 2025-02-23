//Домашнее задание 4.
//        №1
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//        Например:
//ввод - mama, papa
//вывод - mapa



import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два слова: ");
        String word1 = scanner.next(), word2 = scanner.next();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            System.out.println(word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2));
        } else {
            System.out.println("Оба слова должны содержать четное количество букв.");
        }
        scanner.close();
    }
}