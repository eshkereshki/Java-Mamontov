import java.util.List;

/**
 * Утилитный класс для свёртки списка значений в один результат.
 */
public class Reducer {

    /**
     * Выполняет свёртку списка в одно значение.
     *
     * @param values      список значений
     * @param identity    начальное значение
     * @param accumulator функция объединения
     * @param <T>         тип элементов списка
     * @param <R>         тип результата
     * @return итоговое значение
     */
    public static <T, R> R reduce(
            List<T> values,
            R identity,
            BiFunction<R, T> accumulator) {

        R result = identity;

        for (T value : values) {
            result = accumulator.apply(result, value);
        }

        return result;
    }

    /**
     * Функциональный интерфейс объединения.
     */
    @FunctionalInterface
    public interface BiFunction<R, T> {
        R apply(R result, T value);
    }
}
