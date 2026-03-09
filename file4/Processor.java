import java.util.ArrayList;
import java.util.List;

/**
 * Класс для преобразования списка значений.
 */
public class Processor {

    /**
     * Применяет функцию к каждому элементу списка.
     *
     * @param values   исходный список
     * @param function функция преобразования
     * @param <T>      тип входных данных
     * @param <R>      тип результата
     * @return новый список преобразованных значений
     */
    public static <T, R> List<R> apply(List<T> values, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T value : values) {
            result.add(function.apply(value));
        }
        return result;
    }

    /**
     * Функциональный интерфейс преобразования.
     */
    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }
}
