package filecopy;
import java.io.*;
import java.util.Scanner;


public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the path to source file:");
        String sourcePath = scanner.nextLine();

        System.out.println("Type the name of new file:");
        String destinationPath = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {

            String myline;
            while ((myline = reader.readLine()) != null) {
                writer.write(myline);
                writer.newLine(); // перенос строки
            }

            System.out.println("Done successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

