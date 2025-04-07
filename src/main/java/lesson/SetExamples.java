package lesson;

import java.util.*;


public class SetExamples {
    public static void main(String[] args) {
        // === HashSet ===
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");

        // Check if the set contains an element
        System.out.println("HashSet contains 'Apple'? " + hashSet.contains("Apple"));
        for (String item : hashSet) {
            System.out.println("HashSet item: " + item);
        }

        // Remove an element
        hashSet.remove("Banana");

        // Set size
        System.out.println("HashSet size: " + hashSet.size());

        // Check if set is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // Print elements (no specific order)
        System.out.println("HashSet: " + hashSet);

        // === LinkedHashSet ===
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");

        // Same operations
        linkedHashSet.remove("Orange");
        System.out.println("LinkedHashSet contains 'Orange'? " + linkedHashSet.contains("Orange"));
        for (String item : linkedHashSet) {
            System.out.println("LinkedHashSet item: " + item);
        }
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // === TreeSet ===
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");

        System.out.println("TreeSet contains 'Banana'? " + treeSet.contains("Banana"));
        for (String item : treeSet) {
            System.out.println("TreeSet item: " + item);
        }
        System.out.println("TreeSet first element: " + ((TreeSet<String>) treeSet).first()); // Extra TreeSet feature
        System.out.println("TreeSet: " + treeSet);

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet cleared. Is empty? " + treeSet.isEmpty());

        // === Add check ===
        boolean result = treeSet.add("A");
        System.out.println("Is A added ? " + result);

        boolean resultOne = treeSet.add("S");
        System.out.println("Is S added ? " + resultOne);

        System.out.println(treeSet);



        SortedSet<Integer> sortedSet = new TreeSet<>();
    }
}