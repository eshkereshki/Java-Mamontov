package Mamontov.App.MathUtil;

/**
 * Класс Power содержит метод для возведения числа в степень.
 */
public class Power {

    /**
     * Возводит число X в степень Y.
     *
     * @param x строка с числом X
     * @param y строка с числом Y
     * @return результат X в степени Y
     */
    public static double pow(String x, String y) {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        return Math.pow(a, b);
    }
}
