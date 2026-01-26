package Mamontov.App.Birds;

/**
 * Абстрактный класс Mamontov.App.Birds.Bird — базовый класс для всех птиц.
 */
public abstract class Bird {

    /**
     * Текст, который использует птица при пении.
     */
    protected String text;

    /**
     * Конструктор птицы.
     *
     * @param text текст для пения
     */
    public Bird(String text) {
        this.text = text;
    }

    /**
     * Метод пения птицы.
     * Реализуется в подклассах.
     */
    public abstract void sing();
}
