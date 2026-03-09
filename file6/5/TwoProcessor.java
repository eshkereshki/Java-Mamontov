/**
 * Обработчик аннотации @Two.
 * Считывает значения свойств аннотации и выполняет их проверку.
 */
public class TwoProcessor {

    /**
     * Считывает и проверяет значения аннотации @Two у указанного класса.
     *
     * @param clazz класс для анализа
     * @throws IllegalArgumentException если значения аннотации некорректны
     */
    public static void process(Class<?> clazz) {

        if (clazz == null) {
            throw new IllegalArgumentException("Класс не передан.");
        }

        if (!clazz.isAnnotationPresent(Two.class)) {
            throw new IllegalArgumentException(
                    "Аннотация @Two отсутствует у класса " + clazz.getName()
            );
        }

        Two annotation = clazz.getAnnotation(Two.class);

        String firstValue = annotation.first();
        int secondValue = annotation.second();

        if (firstValue.isEmpty() && secondValue < 0) {
            throw new IllegalArgumentException(
                    "Некорректные значения аннотации @Two: first пустая строка и second < 0"
            );
        }
        System.out.println("Значения аннотации @Two:");
        System.out.println("first  = " + firstValue);
        System.out.println("second = " + secondValue);
    }
}
