package main;

public class Lake {
    public boolean isFrosen(Months month) {
        return month.getTemperature() < 0;
    }

    public static void main(String[] args) {
        Lake lake = new Lake();
        for (Months month : Months.values()) {
            if (lake.isFrosen(month)) {
                System.out.println("Lake is frosen");
            } else {
                System.out.println("You can swim there no ice");
            }
        }
    }
}
