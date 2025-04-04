package telran;
import java.awt.*;
import java.util.Scanner;
public class Robo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print numbers of detals:");
        int parts = scanner.nextInt();
        scanner.close();

        Table table = new Table();
        Thread robot1 = new Thread(new Robot1(parts, table));
        Thread robot2 = new Thread(new Robot2(parts, table));

        robot1.start();
        robot2.start();
    }
}
