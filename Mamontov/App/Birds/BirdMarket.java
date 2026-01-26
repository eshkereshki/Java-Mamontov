package Mamontov.App.Birds;

/**
 * Класс Mamontov.App.Birds.BirdMarket моделирует птичий рынок.
 */
public class BirdMarket {

    /**
     * Заставляет петь всех переданных птиц.
     *
     * @param birds массив птиц
     */
    public static void makeBirdsSing(Bird[] birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }
}
