import java.util.LinkedList;
import java.util.Scanner;

public class Calculator2 {
    private static final LinkedList<String> history = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            double result = scanner.nextDouble();

            StringBuilder expression = new StringBuilder();
            expression.append(result);

            while (true) {
                System.out.print("Введите знак операции (+, -, *, /) или = для завершения: ");
                String operator = scanner.next();

                if (operator.equals("=")) {
                    break;
                }

                System.out.print("Введите следующее число: ");
                double number = scanner.nextDouble();

                switch (operator) {
                    case "+" -> result += number;
                    case "-" -> result -= number;
                    case "*" -> result *= number;
                    case "/" -> {
                        if (number == 0) {
                            System.out.println("Ошибка: деление на ноль!");
                            continue;
                        }
                        result /= number;
                    }
                    default -> {
                        System.out.println("Ошибка: неизвестный оператор!");
                        continue;
                    }
                }

                expression.append(" ").append(operator).append(" ").append(number);
            }

            System.out.println("Результат: " + result);
            expression.append(" = ").append(result);

            addToHistory(expression.toString());
            showHistory();
        }
    }

    private static void addToHistory(String entry) {
        if (history.size() == 5) {
            history.removeFirst();
        }
        history.add(entry);
    }

    private static void showHistory() {
        System.out.println("\nИстория вычислений:");
        for (String record : history) {
            System.out.println(record);
        }
        System.out.println();
    }
}