//вводим цену машины
//вводим имеющуюся на руках сумму
// вводим сумму, которую мы можем ежемесячно откладывать
// вводим boolean переменную, есть ли у вас кредитная история(то есть есть ли возможность взять заем в банке)
//если суммы на руках достаточно, то покупаем
//если сумма на руках меньше, чем цена машины, то считаем количество месяцев, необходимое для накопления
//если количество месяцев меньше 12, -> будем копить
//если количество месяцев, необходимое для накопления больше 12,
// то проверяем, если есть возможность взять кдедит в банке, и если такая возможность есть,
// выводим на экран сумму которую возьмем в банке
// (то есть не копим, а берем заем разницы между ценой и суммой на руках) и вывести строчку -> машина куплена!!!

package telran.lessons;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену машины: ");
        double carPrice = scanner.nextDouble();
        System.out.print("Введите сумму, которая у вас есть: ");
        double myMoney = scanner.nextDouble();
        System.out.print("Введите сумму, которую можете откладывать каждый месяц: ");
        double monthlySavings = scanner.nextDouble();
        System.out.print("Есть ли у вас кредитная история: ");
        boolean hasCreditHistory = scanner.nextBoolean();

        if (myMoney >= carPrice) {
            System.out.println("Поздравляем! Вы можете купить машину сразу.");
        } else {
            double moneyNeeded = carPrice - myMoney;
            int monthsToSave = (int) Math.ceil(moneyNeeded / monthlySavings);

            System.out.println("Вам не хватает " + moneyNeeded + "Euro" +
                    "");
            System.out.println("При текущих накоплениях вам понадобится " + monthsToSave + " месяцев.");

            if (monthsToSave <= 12) {
                System.out.println("Вы можете накопить на машину в течение года. Копим!");
            } else if (hasCreditHistory) {
                System.out.println("Ожидание более 12 месяцев. Можно взять заем в банке.");
                System.out.println("Сумма кредита: " + moneyNeeded);
                System.out.println("Машина куплена!");
            } else {
                System.out.println("Ожидание более 12 месяцев, но у вас нет кредитной истории.");
                System.out.println("Придется копить.");
            }
        }
        scanner.close();
    }
}

