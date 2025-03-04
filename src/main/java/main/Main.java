package main;

public class Main {
    public static void main(String[] args) {
        Flyable plane = new Plane(20, 100);
        Flyable bird = new Bird();
        Flyable helicopter = new Helicopter(30, 200);
        Flyable[] flyingObjects = {plane, bird, helicopter};
        for (Flyable object : flyingObjects) {
            System.out.println(object.fly());
        }
        }
    }
