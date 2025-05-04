package foldercopy;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class FolderCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("write path to folder: ");
        String sourceDirPath = scanner.nextLine();

        System.out.print("write new path to folder: ");
        String targetDirPath = scanner.nextLine();

        Path sourcePath = Paths.get(sourceDirPath);
        Path targetPath = Paths.get(targetDirPath);

        try {

            if (!Files.exists(sourcePath) || !Files.isDirectory(sourcePath)) {
                System.out.println("Folder is not found or another error");
                return;
            }
            Files.createDirectories(targetPath);


            Files.walk(sourcePath).forEach(source -> {
                try {
                    Path destination = targetPath.resolve(sourcePath.relativize(source));
                    if (Files.isDirectory(source)) {
                        Files.createDirectories(destination);
                    } else {
                        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException e) {
                    System.err.println("Erorr catch: " + e.getMessage());
                }
            });

            System.out.println("Done!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}