package StreamPoint;

/**
 * Класс, представляющий точку на плоскости.
 */
public class Point {

    /** Координата X */
    private int x;

    /** Координата Y */
    private int y;

    /**
     * Создает точку с заданными координатами.
     *
     * @param x координата X
     * @param y координата Y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату X.
     *
     * @return значение X
     */
    public int getX() {
        return x;
    }

    /**
     * Возвращает координату Y.
     *
     * @return значение Y
     */
    public int getY() {
        return y;
    }

    /**
     * Возвращает строковое представление точки.
     *
     * @return строка в формате {x,y}
     */
    @Override
    public String toString() {
        return "{" + x + "," + y + "}";
    }
}
