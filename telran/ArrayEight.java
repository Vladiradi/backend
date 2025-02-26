//№1.
//
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.

package telran;
import java.util.Random;
import java.util.Arrays;


public class ArrayEight  {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(1, 50);
        }

        System.out.println("Original array " + Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("New array  with zero " + Arrays.toString(array));
    }
}
