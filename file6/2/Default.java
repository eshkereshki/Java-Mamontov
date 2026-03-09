import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Default.
 * Используется для указания класса по умолчанию.
 */
@Target({ElementType.TYPE, ElementType.FIELD}) // Может применяться к типу или полю
@Retention(RetentionPolicy.RUNTIME) // Доступна во время выполнения программы
public @interface Default {

    /**
     * Обязательное свойство value.
     *
     * @return класс, указанный как значение по умолчанию
     */
    Class<?> value();
}
