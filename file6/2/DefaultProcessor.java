/**
 * Обработчик аннотации @Default.
 * Считывает аннотацию и выводит имя класса по умолчанию.
 */
public class DefaultProcessor {

    /**
     * Обрабатывает аннотацию @Default у переданного класса.
     *
     * @param clazz класс для анализа
     */
    public static void process(Class<?> clazz) {

        if (clazz == null) {
            System.out.println("Ошибка: передан null класс.");
            return;
        }

        if (clazz.isAnnotationPresent(Default.class)) {

            Default defaultAnnotation = clazz.getAnnotation(Default.class);
          
            Class<?> defaultClass = defaultAnnotation.value();
        
            System.out.println(
                    "Класс по умолчанию: " + defaultClass.getName()
            );

        } else {
            System.out.println(
                    "Аннотация @Default отсутствует у класса " + clazz.getName()
            );
        }
    }
}
