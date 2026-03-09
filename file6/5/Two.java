import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Two.
 * Содержит два обязательных свойства.
 */
@Target(ElementType.TYPE) // Только TYPE
@Retention(RetentionPolicy.RUNTIME) // Доступна во время исполнения
public @interface Two {

    /**
     * Первое свойство — строковое значение.
     *
     * @return строка
     */
    String first();

    /**
     * Второе свойство — числовое значение.
     *
     * @return целое число
     */
    int second();
}
