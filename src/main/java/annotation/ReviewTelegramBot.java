package annotation;

public class ReviewTelegramBot {
}



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Помечает проблемные места в коде при ревью.
 */
@Retention(RetentionPolicy.RUNTIME)     // сохраняется в байткоде и доступна через Reflection
@Target({ ElementType.TYPE,             // для классов, интерфейсов
        ElementType.FIELD,            // для полей
        ElementType.METHOD })         // для методов
public @interface Review {
    String reviewedBy();  // ФИО ревьювера
    String comment();     // Текст замечания
}