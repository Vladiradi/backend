package main;

public abstract class Aircraft {
    private int fuelTank;
    private int fuelCapacity;
    public Aircraft(int fuelTank, int fuelCapacity) {
        this.fuelTank = fuelTank;
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
