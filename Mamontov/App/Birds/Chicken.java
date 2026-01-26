package Mamontov.App.Birds;

/**
 * Класс Mamontov.App.Birds.Chicken — курица.
 */
public class Chicken extends Bird {

    public Chicken() {
        super("ку-ку");
    }

    @Override
    public void sing() {
        for (int i = 0; i < 10; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }
}
