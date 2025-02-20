//Этот код:
//        1.	Запрашивает у пользователя 6 целых чисел и сохраняет их в массив.
//	2.	Запрашивает ключевой элемент (число, которое нужно найти).
//        3.	Использует линейный поиск, чтобы найти индекс элемента.
//        4.	Выводит результат поиска (индекс или сообщение “Элемент не найден”).
//        5.	Предлагает использовать Debugger для анализа выполнения.
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("Enter array 6 elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int search = input.nextInt();
        int index = linearSearch(array, search);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
        input.close();
    }
    public static int linearSearch(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }
}



//
//import java.util.Scanner;
//
//public class LinearSearchTest {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] массив = new int[6];
//
//        // 1. Получаем 6 чисел от пользователя
//        System.out.println("Введите 6 целых чисел:");
//        for (int i = 0; i < массив.length; i++) {
//            System.out.print("Число " + (i + 1) + ": ");
//            массив[i] = scanner.nextInt();
//        }
//
//        // 2. Получаем ключевой элемент
//        System.out.print("Введите число для поиска: ");
//        int ключевойЭлемент = scanner.nextInt();
//
//        // 3. Линейный поиск
//        int индекс = линейныйПоиск(массив, ключевойЭлемент);
//
//        // 4. Вывод результата
//        if (индекс != -1) {
//            System.out.println("Элемент найден в индексе: " + индекс);
//        } else {
//            System.out.println("Элемент не найден.");
//        }
//
//        scanner.close();
//    }
//
//    // Метод линейного поиска
//    public static int линейныйПоиск(int[] массив, int ключ) {
//        for (int i = 0; i < массив.length; i++) {
//            if (массив[i] == ключ) {
//                return i; // Возвращаем индекс найденного элемента
//            }
//        }
//        return -1; // Если элемент не найден
//    }
//}