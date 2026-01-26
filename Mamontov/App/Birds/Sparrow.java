package Mamontov.App.Birds;

/**
 * Класс Mamontov.App.Birds.Sparrow — воробей.
 */
public class Sparrow extends Bird {

    public Sparrow() {
        super("чирик");
    }

    @Override
    public void sing() {
        System.out.println(text);
    }
}
