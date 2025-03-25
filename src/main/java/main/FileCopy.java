import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        // Убедимся, что передано два аргумента: путь к исходному и целевому файлу
        if (args.length != 2) {
            System.out.println("Использование: java FileCopy <исходный_файл> <целевой_файл>");
            return;
        }

        // Объявляем потоки ввода и вывода
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Открываем файл для чтения
            fis = new FileInputStream(args[0]);

            // Открываем/создаем файл для записи
            fos = new FileOutputStream(args[1]);

            // Буфер для временного хранения данных
            byte[] buffer = new byte[1024];
            int length;

            // Чтение и запись данных по частям (пока есть что читать)
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length); // Запись считанных байтов
            }

            System.out.println("Файл успешно скопирован.");

        } catch (IOException e) {
            // Обработка исключений при работе с файлами
            System.out.println("Произошла ошибка при копировании файла: " + e.getMessage());

        } finally {
            // Закрытие потоков в блоке finally (даже если произошла ошибка)
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException ex) {
                System.out.println("Ошибка при закрытии файлов: " + ex.getMessage());
            }
        }
    }
}