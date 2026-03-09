/**
 * Обобщённое хранилище значения.
 *
 * @param <T> тип хранимого значения
 */
public class Storage<T> {

    /** Хранимое значение (может быть null) */
    private final T value;

    /**
     * Создаёт хранилище.
     *
     * @param value значение для хранения (может быть null)
     */
    public Storage(T value) {
        this.value = value;
    }

    /**
     * Возвращает хранимое значение или альтернативу,
     * если значение равно null.
     *
     * @param alternative альтернативное значение
     * @return value или alternative
     */
    public T getOrElse(T alternative) {
        return value != null ? value : alternative;
    }
}
