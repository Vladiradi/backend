//Написать приложение, которое будет копировать информацию из файла в другой файл с использованием NIO.
//        Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.

package task01;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write path for file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Type name for new file with path");
        String destPath = scanner.nextLine();

        Path source = Paths.get(sourcePath);
        Path dest = Paths.get(destPath);

        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Done successfully");
        } catch (IOException e) {
            System.out.println("Error while copying " + e.getMessage());
        }
    }

}

