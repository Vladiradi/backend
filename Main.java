//Создайте switch-блок, который мог бы определить, является ли переданный день выходным или рабочим днем.
//        Создайте переменные int day; String dayString;
//        Реализуйте тот же процесс используя if-else блоки
//        Реализуйте тот же процесс используя тернарное выражение
//        Сравните решения

package telran.lessons;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите день недели (число от 1 до 7): ");
        int day = input.nextInt();
        String dayString;
        String dayoffOrWorkday = (day == 6 || day == 7) ? "Выходной день" : "Рабочий день";
        switch (day) {
            case 1: dayString = "Понедельник"; break;
            case 2: dayString = "Вторник"; break;
            case 3: dayString = "Среда"; break;
            case 4: dayString = "Четверг"; break;
            case 5: dayString = "Пятница"; break;
            case 6: dayString = "Суббота"; break;
            case 7: dayString = "Воскресенье"; break;
            default:
                dayString = "Некорректный ввод";
                dayoffOrWorkday = "";
        }

        if (!dayoffOrWorkday.isEmpty()) {
            System.out.println(dayString + " - " + dayoffOrWorkday);
        } else {
            System.out.println("Ошибка: " + dayString);
        }

        input.close();
    }
}