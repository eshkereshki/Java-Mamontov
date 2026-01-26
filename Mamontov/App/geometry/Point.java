package Mamontov.App.geometry;

/**
 * Класс Mamontov.App.geometry.Point представляет точку на двумерной плоскости.
 */
public class Point {

    protected int x;
    protected int y;

    /**
     * Создаёт точку с координатами X и Y.
     *
     * @param x координата X
     * @param y координата Y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return текстовое представление точки (X;Y)
     */
    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
