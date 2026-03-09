import java.util.*;
import java.util.function.Function;

/**
 * Утилитный класс для сборки и группировки коллекций.
 */
public class Collector {

    /**
     * Добавляет элементы из source в targetCollection.
     *
     * @param source           исходный список
     * @param targetCollection целевая коллекция
     * @param <T>              тип элементов
     * @param <P>              тип коллекции
     * @return заполненная коллекция
     */
    public static <T, P extends Collection<T>> P collect(
            List<T> source,
            P targetCollection) {

        if (targetCollection == null) {
            throw new IllegalArgumentException("Target collection cannot be null");
        }

        targetCollection.addAll(source);
        return targetCollection;
    }

    /**
     * Создаёт Set без дубликатов.
     */
    public static <T> Set<T> collectToSet(List<T> source) {
        return new HashSet<>(source);
    }

    /**
     * Группирует элементы по ключу.
     *
     * @param source    исходный список
     * @param keyMapper функция получения ключа
     * @param <T>       тип элементов
     * @param <K>       тип ключа
     * @return список групп
     */
    public static <T, K> List<List<T>> collectByGroup(
            List<T> source,
            Function<T, K> keyMapper) {

        Map<K, List<T>> groups = new LinkedHashMap<>();

        for (T item : source) {
            K key = keyMapper.apply(item);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(item);
        }

        return new ArrayList<>(groups.values());
    }
}
