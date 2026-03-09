/**
 * Класс для демонстрации аннотации @Cache.
 */
@Cache({"users", "products", "orders"})
public class CacheAnnotatedClass {

    /**
     * Пример поля.
     */
    private String example;
}
