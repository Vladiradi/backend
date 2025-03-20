package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.*;

public class ListTask {
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
        System.out.println("Обратный список: " + reversed);


        splitEvenOdd(integers);
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
        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }


    public static void splitEvenOdd(List<Integer> list) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : list) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }


        System.out.println("Чётные числа: " + even);
        System.out.println("Нечётные числа: " + odd);
    }
}









