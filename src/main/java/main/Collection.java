package main;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");
        System.out.println("Before sort:" + list);
        Collections.sort(list);
        System.out.println("After sort:" + list);
    }

}

//
//public class CompareExample {
//
//    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        integers.add(6);
//        integers.add(3);
//        integers.add(1);
//        integers.add(7);
//        integers.add(9);
//
//        System.out.println("Before sort: " + integers);
//
//        Collections.sort(integers);
//
//        System.out.println("After sort: " + integers);
//    }
//}