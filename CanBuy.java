//Создайте две переменные *isEdekaOpen* и *isReweOpen*, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод *canBuy*,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.

import java.util.Scanner;
public class CanBuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Магазин Edeka открыт? (true/false): ");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.print("Магазин Rewe открыт? (true/false): ");
        boolean isReweOpen = scanner.nextBoolean();

        if (isEdekaOpen && isReweOpen) {
            System.out.println("Я могу купить еду в Edeka и Rewe.");
        } else if (isEdekaOpen) {
            System.out.println("Я могу купить еду в Edeka.");
        } else if (isReweOpen) {
            System.out.println("Я могу купить еду в Rewe.");
        } else {
            System.out.println("Я не могу купить еду, оба магазина закрыты.");
        }
        scanner.close();
    }
}