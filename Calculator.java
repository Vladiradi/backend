import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    static final String CONTINUE = "Y";
    static final String EXIT = "N";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            calc();
            System.out.println("Do you want to continue? (Y/N)");
            String answer = scanner.nextLine();
            while (true) {
                if (CONTINUE.equals(answer)) {
                    flag = true;
                    break;
                } else if (EXIT.equals(answer)) {
                    System.out.println("Goodbye!");
                    return;
                } else {
                    System.out.println("Wrong data, pls try  again (Y/N)");
                    answer = scanner.nextLine();
                }
            }
        } while (flag);
    }


    private static void calc() {

        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        double argOne, argTwo;
        char operator;

        System.out.println("Fist number: ");
        argOne = scanner.nextDouble();
        double result = 0;

        do {
            System.out.println("Second number: ");
            argTwo = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Operator (+, -, /, *, 😵 ");
            String nextLine = scanner.nextLine();

            if (nextLine.isEmpty()) {
                System.out.println("Error: No operator entered.");
                return;
            }
            operator = nextLine.charAt(0);


        } while (argTwo == 0 && (operator == '/' || operator  == '%'));



        switch (operator) {
            case '+':
                result = argOne + argTwo;
                System.out.println(argOne + " " + operator + " " + argTwo + " " + "= " + String.format("%.2f", result));
                break;
            case '-':
                result = argOne - argTwo;
                System.out.println(argOne + " " + operator + " " + argTwo + " " + "= " + String.format("%.2f", result));
                break;
            case '/':
                if (argTwo == 0) {
                    System.out.println("Error: Division by zero");
                    break;
                }
                result = argOne / argTwo;
                System.out.println(argOne + " " + operator + " " + argTwo + " " + "= " + String.format("%.2f", result));
                break;
            case '*':
                result = argOne * argTwo;
                System.out.println(argOne + " " + operator + " " + argTwo + " " + "= " + String.format("%.2f", result));
                break;
            case '%':
                if (argTwo == 0) {
                    System.out.println("Error: Division by zero");
                    break;
                }
                result = argOne % argTwo;
                System.out.println(argOne + " " + operator + " " + argTwo + " " + "= " + String.format("%.2f", result));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}