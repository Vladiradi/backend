package main;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new ModernCalculator(); // или IntegerCalculator
        System.out.println("Integer add: 5 + 3 = " + intCalc.add(5, 3));
        System.out.println("Integer sub: 5 - 3 = " + intCalc.sub(5, 3));
        System.out.println("Integer multi: 5 * 3 = " + intCalc.multi(5, 3));
        System.out.println("Integer div: 6 / 3 = " + intCalc.div(6, 3));

        System.out.println();

        Concert<Performer> concert = new Concert<>();
        concert.addPerformer(new Singer());
        concert.addPerformer(new Dancer());

        concert.start();
    }
}
