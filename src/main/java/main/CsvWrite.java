package main;


import java.nio.file.*;
import java.util.List;

public class CsvWrite {
    public static void main(String[] args) throws Exception {
        Path csvPath = Path.of("users.csv");

        List<String> csvLines = List.of(
                "id,name,email",
                "1,Anna,anna@example.com",
                "2,John,john@example.com"
        );

        // Записываем строки в файл
        Files.write(csvPath, csvLines);

        System.out.println("CSV-файл записан.");
    }
}
