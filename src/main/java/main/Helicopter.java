package main;

public class Helicopter extends Aircraft implements Flyable {
    public Helicopter(int fuelTank, int fuelCapacity) {
        super(fuelTank, fuelCapacity);
    }
    @Override
    public String fly(){
        return "Helicopter helicopter parapooper parapooper" ;
    }

}
