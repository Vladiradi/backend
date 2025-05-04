package filecopy;
import java.io.*
        import java.util.Scanner;

public class FileCopy {
}



//
//public class FileCopySimple {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите путь к исходному файлу: ");
//        String sourcePath = scanner.nextLine();
//
//        System.out.print("Введите имя нового файла: ");
//        String destinationPath = scanner.nextLine();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.newLine();
//            }
//
//            System.out.println("Файл успешно скопирован.");
//
//        } catch (IOException e) {
//            System.out.println("Произошла ошибка: " + e.getMessage());
//        }
//    }
//}

//sxxsdfsdf