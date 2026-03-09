/**
 * Класс для демонстрации аннотации @ToString.
 */
@ToString 
public class Person {

    /**
     * Имя человека (будет включено).
     */
    private String name;

    /**
     * Возраст человека (будет включён).
     */
    private int age;

    /**
     * Пароль (НЕ будет включён).
     */
    @ToString(Mode.NO)
    private String password;

    /**
     * Конструктор.
     *
     * @param name имя
     * @param age возраст
     * @param password пароль
     */
    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
