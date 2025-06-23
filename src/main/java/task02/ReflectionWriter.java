//Используя только Reflection API и библиотеку NIO,
//        создайте файл и сохраните в него строку "Я тестирую работу
//        Reflection API при работе с NIO".
package task02;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.Set;


public class ReflectionWriter {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("test.txt");

        Class<?> filesClass = Class.forName("java.nio.file.Files");

        Method writeStringMethod = filesClass.getDeclaredMethod(
                "writeString",
                Path.class, CharSequence.class, OpenOption[].class
        );

        writeStringMethod.setAccessible(true);

        OpenOption[] options = {
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
        };

        writeStringMethod.invoke(null, path,
                "I am testing Reflection API",
                (Object) options
        );

        System.out.println("File created");
    }
}


