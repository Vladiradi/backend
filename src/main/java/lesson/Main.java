package lesson;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Key: HashSet example
        Set<String> fruits = new HashSet<>();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits in HashSet: " + fruits);

        // Value: HashMap example
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Lemon", 5);
        fruitMap.put("Apple", 3);
        fruitMap.put("Pineapple", 2);
        fruitMap.put("Orange", 4);


        Map<String, Integer> juiseMap = new HashMap<>();
        juiseMap.put("Orange", 125);
        juiseMap.put("Apple", 169);

        System.out.println("Juise: " + juiseMap);



        System.out.println("Fruits in HashMap with quantities: " + fruitMap);
    }
}

