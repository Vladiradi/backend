package main;

public class Main {
    public static void main(String[] args) {
        Animal[] dinner = {
                new Human(),
                new Dog()
        };
        for (Animal animal : dinner) {
            animal.eat();
        }
    }
}