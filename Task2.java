


//№ 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль

public class Task2 {
    public void execute() {
        // Определяем два числа для операций
        double num1 = 10;
        double num2 = 5;

        // Вызов всех методов и вывод результатов в консоль
        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
    }

    /**
     * Метод для сложения двух чисел
     */
    private double add(double a, double b) {
        return a + b;
    }

    /**
     * Метод для вычитания одного числа из другого
     */
    private double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Метод для умножения двух чисел
     */
    private double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Метод для деления одного числа на другое
     * Обрабатывает случай деления на ноль
     */
    private double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return Double.NaN; // Возвращает NaN (Not a Number) в случае ошибки
        }
        return a / b;
    }

    // Метод main для запуска программы
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.execute();
    }
}