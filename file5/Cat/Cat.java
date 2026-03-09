package Cat;

/**
 * Класс, представляющий кота.
 * Кот умеет мяукать и считает количество своих мяуканий.
 */
public class Cat implements Meowable {

    /** Имя кота */
    private String name;

    /** Количество мяуканий */
    private int meowCount = 0;

    /**
     * Создает объект кота.
     *
     * @param name имя кота
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * Метод мяуканья.
     * Выводит сообщение в консоль и увеличивает счетчик мяуканий.
     */
    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
        meowCount++;
    }

    /**
     * Возвращает количество мяуканий кота.
     *
     * @return количество мяуканий
     */
    public int getMeowCount() {
        return meowCount;
    }

    /**
     * Возвращает строковое представление кота.
     *
     * @return строка с именем кота
     */
    @Override
    public String toString() {
        return "Кот: " + name;
    }
}
