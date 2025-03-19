package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

//        List<Integer> reversed = reverseList(integers);
//        System.out.println("Reverse list: " + reversed);
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

}






