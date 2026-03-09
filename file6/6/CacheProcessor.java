/**
 * Обработчик аннотации @Cache.
 */
public class CacheProcessor {

    /**
     * Выводит список кешируемых областей.
     *
     * @param clazz класс для анализа
     */
    public static void process(Class<?> clazz) {

        if (clazz == null) {
            System.out.println("Ошибка: класс не передан.");
            return;
        }

        if (!clazz.isAnnotationPresent(Cache.class)) {
            System.out.println(
                    "Аннотация @Cache отсутствует у класса " + clazz.getName()
            );
            return;
        }

        Cache cache = clazz.getAnnotation(Cache.class);

        String[] areas = cache.value();

        if (areas.length == 0) {
            System.out.println("Список кешируемых областей пуст.");
            return;
        }

        System.out.println("Кешируемые области:");

        for (String area : areas) {
            System.out.println(" - " + area);
        }
    }
}
