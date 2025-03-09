package main;

public enum Months {
    JANUARY(-8),
    FEBRUARY(-3),
    MARCH(2),
    APRIL(15),
    MAY(16),
    JUNE(20),
    JULY(23),
    AUGUST(20),
    SEPTEMBER(15),
    OCTOBER(8),
    NOVEMBER(2),
    DECEMBER(-2);

    private final int temperature;
    Months(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
