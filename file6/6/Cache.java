import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Cache.
 * Содержит список кешируемых областей.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {

    /**
     * Необязательное свойство value.
     * По умолчанию — пустой массив.
     *
     * @return массив имён кешируемых областей
     */
    String[] value() default {};
}
