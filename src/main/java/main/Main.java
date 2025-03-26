package main;


public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new IntegerCalculator();
        System.out.println("Integer add: 5 + 3 = " + intCalc.add(5, 3));
        System.out.println("Integer sub: 5 - 3 = " + intCalc.sub(5, 3));
        System.out.println("Integer multi: 5 * 3 = " + intCalc.multi(5, 3));
        System.out.println("Integer div: 6 / 3 = " + intCalc.div(6, 3));

        System.out.println();

        Calculator<Double> doubleCalc = new DoubleCalculator();
        System.out.println("Double add: 5.5 + 3.2 = " + doubleCalc.add(5.5, 3.2));
        System.out.println("Double sub: 5.5 - 3.2 = " + doubleCalc.sub(5.5, 3.2));
        System.out.println("Double multi: 5.5 * 3.2 = " + doubleCalc.multi(5.5, 3.2));
        System.out.println("Double div: 6.4 / 3.2 = " + doubleCalc.div(6.4, 3.2));
    }
}