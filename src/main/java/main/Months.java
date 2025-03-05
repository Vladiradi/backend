package main;

public enum Months {
    JANUARY(-5),
    FEBRUARY(-3),
    MARCH(5),
    APRIL(12),
    MAY(18),
    JUNE(22),
    JULY(25),
    AUGUST(24),
    SEPTEMBER(18),
    OCTOBER(10),
    NOVEMBER(3),
    DECEMBER(-2);

    private final int temperature;
    Months(int temperature) {
        this.temperature = temperature;
    }
}