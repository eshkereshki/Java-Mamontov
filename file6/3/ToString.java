import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @ToString.
 * Управляет включением полей в строковое представление объекта.
 */
@Target({ElementType.TYPE, ElementType.FIELD}) // TYPE или FIELD
@Retention(RetentionPolicy.RUNTIME) // Доступна во время исполнения
public @interface ToString {

    /**
     * Свойство value.
     * По умолчанию YES.
     *
     * @return режим отображения
     */
    Mode value() default Mode.YES;
}
