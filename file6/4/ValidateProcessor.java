/**
 * Обработчик аннотации @Validate.
 */
public class ValidateProcessor {

    /**
     * Выводит список классов, указанных в аннотации @Validate.
     *
     * @param clazz класс для анализа
     */
    public static void process(Class<?> clazz) {

        if (clazz == null) {
            System.out.println("Ошибка: класс не передан.");
            return;
        }

        if (!clazz.isAnnotationPresent(Validate.class)) {
            System.out.println(
                    "Аннотация @Validate отсутствует у класса " + clazz.getName()
            );
            return;
        }

        Validate validate = clazz.getAnnotation(Validate.class);

        Class<?>[] classes = validate.value();

        System.out.println("Классы для проверки:");

        for (Class<?> cls : classes) {
            System.out.println(" - " + cls.getName());
        }
    }
}
