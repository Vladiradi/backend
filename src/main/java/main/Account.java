package main;

class Account<T> {
    private T id; // id может быть любым типом T
    private double sum;

    // Конструктор для AccountObject с id типа T
    public Account(T id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }
}