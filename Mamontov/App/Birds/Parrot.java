package Mamontov.App.Birds;

import java.util.Random;

/**
 * Класс Parrot — попугай.
 */
public class Parrot extends Bird {

    private final Random random = new Random();

    /**
     * Создаёт попугая с заданным текстом.
     *
     * @param text текст, который знает попугай
     */
    public Parrot(String text) {
        super(text);
    }

    @Override
    public void sing() {
        int length = 1 + random.nextInt(text.length());
        System.out.println(text.substring(0, length));
    }
}
