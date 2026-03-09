/**
 * Обобщённый контейнер для хранения одного объекта.
 *
 * @param <T> тип хранимого объекта
 */
public class Box<T> {

    /** Хранимое значение */
    private T content;

    /**
     * Создаёт пустую коробку.
     */
    public Box() {
        this.content = null;
    }

    /**
     * Помещает объект в коробку.
     *
     * @param item объект для хранения
     */
    public void put(T item) {
        this.content = item;
    }

    /**
     * Возвращает текущее содержимое коробки.
     *
     * @return объект внутри коробки или null
     */
    public T get() {
        return content;
    }

    /**
     * Проверяет, пуста ли коробка.
     *
     * @return true если коробка пуста
     */
    public boolean isEmpty() {
        return content == null;
    }

    /**
     * Извлекает объект из коробки и очищает её.
     *
     * @return извлечённый объект
     * @throws IllegalStateException если коробка пуста
     */
    public T take() {
        if (isEmpty()) {
            throw new IllegalStateException("Box is empty");
        }
        T item = content;
        content = null;
        return item;
    }
}
