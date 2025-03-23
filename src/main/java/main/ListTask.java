package main;

import java.util.*;

public class ListTask {
    static List<Integer> even = new ArrayList<>();
    static List<Integer> odd = new ArrayList<>();

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }

        System.out.println("List original: " + integers);

        int max = findMax(integers);
        System.out.println("Max: " + max);

        int min = findMin(integers);
        System.out.println("Min: " + min);

        List<Integer> reversed = reverseList(integers);
        System.out.println("Reverse list: " + reversed);

        splitEvenOdd(integers);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    public static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int num : list) {
            min = Math.min(min, num);
        }
        return min;
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void splitEvenOdd(List<Integer> list) {
        even.clear();
        odd.clear();

        for (int num : list) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
    }
}



