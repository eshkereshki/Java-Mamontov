import java.lang.reflect.Method;

/**
 * Класс-обработчик аннотации @Invoke.
 * Ищет и вызывает все методы, помеченные данной аннотацией.
 */
public class InvokeProcessor {

    /**
     * Выполняет поиск и вызов методов с аннотацией @Invoke.
     *
     * @param object объект, методы которого будут проверяться
     */
    public static void process(Object object) {

        if (object == null) {
            System.out.println("Ошибка: передан null объект.");
            return;
        }

        Class<?> clazz = object.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.setAccessible(true);

                    method.invoke(object);

                } catch (Exception e) {
                   
                    System.out.println(
                            "Ошибка при вызове метода: " + method.getName()
                    );
                }
            }
        }
    }
}
