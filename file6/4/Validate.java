import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Validate.
 * Содержит список классов для проверки.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE}) 
@Retention(RetentionPolicy.RUNTIME) 
public @interface Validate {

    /**
     * Обязательное свойство value.
     *
     * @return массив классов для проверки
     */
    Class<?>[] value();
}
