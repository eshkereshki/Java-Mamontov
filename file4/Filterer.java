import java.util.ArrayList;
import java.util.List;

/**
 * Класс для фильтрации списка по условию.
 */
public class Filterer {

    /**
     * Фильтрует список по заданному предикату.
     *
     * @param values    исходный список
     * @param predicate условие отбора
     * @param <T>       тип элементов
     * @return новый список, содержащий только подходящие элементы
     */
    public static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T value : values) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }
        return result;
    }

    /**
     * Функциональный интерфейс условия.
     */
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }
}
