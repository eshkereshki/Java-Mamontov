import java.util.*;

/**
 * Точка входа в программу.
 * Демонстрирует работу всех реализованных обобщённых классов.
 */
public class Main {

    /**
     * Главный метод программы.
     */
    public static void main(String[] args) {

        System.out.println("=== Задача 1: Box ===");

        Box<Integer> integerBox = new Box<>();
        integerBox.put(3);
        int extractedInt = extract(integerBox);
        System.out.println("Извлеченное значение: " + extractedInt);

        System.out.println("\n=== Задача 2: Storage ===");

        Storage<Integer> intStorageNull = new Storage<>(null);
        System.out.println("Извлечено число (null → 0): "
                + intStorageNull.getOrElse(0));

        Storage<Integer> intStorage99 = new Storage<>(99);
        System.out.println("Извлечено число (99): "
                + intStorage99.getOrElse(-1));

        Storage<String> stringStorageNull = new Storage<>(null);
        System.out.println("Извлечена строка (null → default): "
                + stringStorageNull.getOrElse("default"));

        Storage<String> stringStorageHello = new Storage<>("hello");
        System.out.println("Извлечена строка (hello): "
                + stringStorageHello.getOrElse("hello world"));

        System.out.println("\n=== Задача 3: Wildcards ===");

        Box<Point3D> pointBox = new Box<>();
        BoxUtil.putPoint(pointBox);
        System.out.println("Box<Point3D>: " + pointBox.get());

        Box<Object> objectBox = new Box<>();
        BoxUtil.putPoint(objectBox);
        System.out.println("Box<Object>: " + objectBox.get());

        System.out.println("\n=== Задача 3.1: Processor ===");

        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = Processor.apply(strings, String::length);
        System.out.println("Длины строк: " + lengths);

        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> absNumbers = Processor.apply(numbers, Math::abs);
        System.out.println("Абсолютные значения: " + absNumbers);

        System.out.println("\n=== Задача 3.2: Filter ===");

        List<String> strings2 = Arrays.asList("qwerty", "asdfg", "zx", "a", "hello");
        List<String> shortStrings =
                Filterer.filter(strings2, s -> s.length() < 3);
        System.out.println("Строки короче 3 символов: " + shortStrings);

        List<Integer> numbers2 = Arrays.asList(1, -3, 7, -2, 0, 5);
        List<Integer> positiveNumbers =
                Filterer.filter(numbers2, n -> n > 0);
        System.out.println("Положительные числа: " + positiveNumbers);

        System.out.println("\n=== Задача 3.4: Reducer ===");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int sum = Reducer.reduce(nums, 0, (acc, n) -> acc + n);
        System.out.println("Сумма чисел: " + sum);

        int product = Reducer.reduce(nums, 1, (acc, n) -> acc * n);
        System.out.println("Произведение чисел: " + product);

        List<String> words = Arrays.asList("Hello", " ", "World");
        String combined =
                Reducer.reduce(words, "", (acc, s) -> acc + s);
        System.out.println("Объединение строк: " + combined);

        System.out.println("\n=== Collector (дополнительно) ===");

        List<String> withDuplicates =
                Arrays.asList("qwerty", "asdfg", "qwerty", "qw");

        Set<String> uniqueStrings =
                Collector.collectToSet(withDuplicates);

        System.out.println("Уникальные строки: " + uniqueStrings);
    }

    /**
     * Извлекает значение из Box.
     *
     * @param box коробка
     * @param <T> тип значения
     * @return извлечённый объект
     * @throws IllegalStateException если коробка пуста
     */
    public static <T> T extract(Box<T> box) {
        if (box.isEmpty()) {
            throw new IllegalStateException("Переданная коробка пуста");
        }
        return box.take();
    }
}
