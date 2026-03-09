/**
 * Класс для демонстрации аннотации @Validate.
 */
@Validate({String.class, Integer.class, Person.class})
public class ValidatedClass {

    /**
     * Пример поля.
     */
    private String example;
}
