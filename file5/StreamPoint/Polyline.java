package StreamPoint;

import java.util.List;

/**
 * Класс, представляющий ломаную линию (Polyline).
 * Ломаная состоит из последовательности точек.
 */
public class Polyline {

    /** Список точек, образующих ломаную */
    private List<Point> points;

    /**
     * Создает ломаную линию из списка точек.
     *
     * @param points список точек
     */
    public Polyline(List<Point> points) {
        this.points = points;
    }

    /**
     * Возвращает строковое представление ломаной линии.
     *
     * @return строка с описанием ломаной
     */
    @Override
    public String toString() {
        return "Линия " + points;
    }
}
