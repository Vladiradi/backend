package main;

public class Plane extends Aircraft implements Flyable{
    public Plane(int fuelTank, int fuelCapacity) {
        super(fuelTank, fuelCapacity);
    }
    @Override
    public String fly() {
        return "Plane flying with jet engine";
    }
