import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация @Invoke.
 * Используется для автоматического вызова методов через Reflection API.
 */
@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}
