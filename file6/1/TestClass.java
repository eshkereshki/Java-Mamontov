/**
 * Класс, содержащий методы для демонстрации работы аннотации @Invoke.
 */
public class TestClass {

    /**
     * Метод, помеченный аннотацией @Invoke.
     * Будет автоматически вызван через Reflection API.
     */
    @Invoke
    public void invokedMethod() {
        System.out.println("Метод invokedMethod() был автоматически вызван!");
    }

    /**
     * Обычный метод без аннотации.
     * Не будет вызван обработчиком.
     */
    public void regularMethod() {
        System.out.println("Это обычный метод, он не помечен @Invoke.");
    }
}
