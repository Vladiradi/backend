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
