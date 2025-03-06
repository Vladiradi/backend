package main;

class Airport {
    public void makeFly(Flyable[] flyables) {
        for (Flyable f : flyables) {
            System.out.println(f.fly());
        }
    }

    public static void main(String[] args) {
        Flyable[] flyingObjects = {
                new Airplane(),
                new Helicopter()
        };

        Airport airport = new Airport();
        airport.makeFly(flyingObjects);
    }
}