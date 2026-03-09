package Cat;

/**
 * Класс с вспомогательными функциями для работы с объектами,
 * реализующими интерфейс Meowable.
 */
public class Funs {

    /**
     * Метод вызывает мяуканье у всех переданных объектов.
     *
     * @param cats объекты, которые умеют мяукать
     */
    public static void meowsCare(Meowable... cats) {
        for (Meowable cat : cats) {
            cat.meow();
        }
    }
}
