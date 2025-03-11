package main;

public class Main {
    public static void main(String[] args) {
        // Создание объекта AccountObject с id типа Integer
        AccountObject<Integer> accountObject1 = new AccountObject<>(12345, 2000);
        System.out.println("accountObject1 = " + accountObject1.getId());

        // Создание объекта AccountObject с id типа String
        AccountObject<String> accountObject2 = new AccountObject<>("DE12345", 2000);
        System.out.println("accountObject2 = " + accountObject2.getId());

        // Приведение типа и арифметическая операция для accountObject1 (Integer)
        Integer sum1 = accountObject1.getId() + 12; // Успешно, так как id - это Integer
        System.out.println("sum1 = " + sum1);

        // Ошибка при попытке выполнить арифметическую операцию для accountObject2
        // Нужно проверить, можно ли привести id к Integer, иначе возникнет ошибка
        try {
            // Преобразуем строку в Integer
            Integer sum2 = Integer.parseInt(accountObject2.getId()) + 33;
            System.out.println("sum2 = " + sum2);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка при преобразовании id в число: " + e.getMessage());
        }
    }
}
