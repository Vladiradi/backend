import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 2, "Donald", 3);
        Cat lucy = new Cat("Lucy", 4, "Melany", 2);
        Cat garfield = new Cat("Garfield", 5, "Joe", 4);
        Cat gato = new Cat("Gato", 6, "Ivan", 3);
        Cat butcher = new Cat("Butcher", 7, "John", 1);

        Cat[] cats = {tom, lucy, garfield, gato, butcher};

        Scanner scanner = new Scanner(System.in);
        for (Cat cat : cats) {
            System.out.println("Cat name: " + cat.getCatName());

            System.out.print("Enter the number of food packs for " + cat.getCatName() + " (must be positive): ");
            int foodPacks = scanner.nextInt();
            if (foodPacks >= 0) {
                cat.setFoodPacks(foodPacks);
            } else {
                System.out.println("Food packs cannot be negative.");
            }

            System.out.print("Enter the position for " + cat.getCatName() + " (e.g., Home, Outside): ");
            scanner.nextLine();  // Consume the leftover newline character
            String position = scanner.nextLine();
            cat.setCatPosition(position);

            // Print the cat's information
            cat.printInfo();
        }

        scanner.close();
    }
}