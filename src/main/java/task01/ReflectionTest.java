//        При работе с NIO мы раньше использовали класс Files.
//        Используя Reflection API исследуйте его и выведите на экран:
//        все его конструкторы, вне зависимости от модификатора доступа;
//        все методы, вне зависимости от модификатора доступа;
//        все поля (характеристики), вне зависимости от модификатора доступа;




        package task01;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.lang.reflect.Constructor;

public class ReflectionTest {
    public static void main(String[] args) {
        Class<?> clazz = Files.class;

        System.out.println("-------Конструкторы ");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\n-------Методы");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("\n -------Поля");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}