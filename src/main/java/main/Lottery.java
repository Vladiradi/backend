package main;

import java.util.*;

public class Lottery {
    private static final int NUMBERS_COUNT = 5;
    private static final int MAX_NUMBER = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] playerNumbers = new int[3][NUMBERS_COUNT];


        for (int i = 0; i < 3; i++) {
            System.out.println("Игрок " + (i + 1) + ", введите " + NUMBERS_COUNT + " уникальных числа от 1 до " + MAX_NUMBER + ":");
            int count = 0;
            while (count < NUMBERS_COUNT) {
                int num = scanner.nextInt();
                if (num >= 1 && num <= MAX_NUMBER && !contains(playerNumbers[i], num, count)) {
                    playerNumbers[i][count] = num;
                    count++;
                } else {
                    System.out.println("Неверное число или уже введено. Повторите:");
                }
            }
        }


        int[] winningNumbers = generateWinningNumbers();

        System.out.println("\nВыигрышные номера: " + Arrays.toString(winningNumbers));


        for (int i = 0; i < 3; i++) {
            int matches = countMatches(playerNumbers[i], winningNumbers);
            System.out.println("Игрок " + (i + 1) + " угадал: " + matches + " чисел");
        }
    }

    public static boolean contains(int[] arr, int value, int limit) {
        for (int i = 0; i < limit; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }

    public static int[] generateWinningNumbers() {
        int[] numbers = new int[NUMBERS_COUNT];
        Random rand = new Random();
        int count = 0;
        while (count < NUMBERS_COUNT) {
            int num = rand.nextInt(MAX_NUMBER) + 1;
            if (!contains(numbers, num, count)) {
                numbers[count++] = num;
            }
        }
        return numbers;
    }

    public static int countMatches(int[] player, int[] winning) {
        int match = 0;
        for (int p : player) {
            for (int w : winning) {
                if (p == w) match++;
            }
        }
        return match;
    }
}