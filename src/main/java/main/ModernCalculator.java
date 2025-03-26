package main;

public class ModernCalculator implements Calculator<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }
    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }
    @Override
    public Integer devide(Integer a, Integer b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}
