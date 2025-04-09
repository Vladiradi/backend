    package lesson;

import java.util.HashSet;
import java.util.Set;

public class DogApp {

    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", 5); // вызов конструктора

        Set<Dog> dogs = new HashSet<>();
        dogs.add(bobik);

        System.out.println(dogs); // печатает сет
    }
}
