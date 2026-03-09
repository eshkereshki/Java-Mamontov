import java.lang.reflect.Field;

/**
 * Класс для формирования строкового представления объекта
 * с учётом аннотации @ToString.
 */
public class ToStringProcessor {

    /**
     * Формирует строковое представление объекта.
     *
     * @param object объект для анализа
     * @return строковое представление
     */
    public static String buildToString(Object object) {

        if (object == null) {
            return "null";
        }
      
        Class<?> clazz = object.getClass();
       
        if (!clazz.isAnnotationPresent(ToString.class)) {
            return object.toString();
        }

        StringBuilder result = new StringBuilder();
        result.append(clazz.getSimpleName()).append(" { ");
      
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
        
            Mode mode = Mode.YES;

            if (field.isAnnotationPresent(ToString.class)) {
                mode = field.getAnnotation(ToString.class).value();
            }

            if (mode == Mode.NO) {
                continue;
            }

            try {
                field.setAccessible(true);

                result.append(field.getName())
                        .append("=")
                        .append(field.get(object))
                        .append(", ");

            } catch (IllegalAccessException e) {
                System.out.println(
                        "Ошибка доступа к полю: " + field.getName()
                );
            }
        }

        if (result.lastIndexOf(", ") == result.length() - 2) {
            result.delete(result.length() - 2, result.length());
        }

        result.append(" }");

        return result.toString();
    }
}
