package main;


public class Auditory {
    private int capacity;
    private int number;

    public Auditory(int capacity, int number) {
        this.capacity = capacity;
        this.number = number;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Auditory) {
            if (this.capacity == ((Auditory) o).capacity) {
                if (this.number.equals(((Auditory) o).number)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}


