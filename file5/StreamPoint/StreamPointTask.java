package StreamPoint;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс, реализующий задачу построения ломаной линии
 * из списка точек с использованием Stream API.
 */
public class StreamPointTask {

    /**
     * Строит ломаную линию из списка точек.
     * <p>
     * Выполняются следующие операции:
     * <ul>
     *     <li>удаляются дубликаты точек</li>
     *     <li>точки сортируются по координате X</li>
     *     <li>координаты преобразуются в абсолютные значения</li>
     * </ul>
     *
     * @param points список исходных точек
     * @return объект Polyline, содержащий обработанный список точек
     */
    public static Polyline build(List<Point> points) {

        List<Point> result = points.stream()
                .distinct()
                .sorted(Comparator.comparing(Point::getX))
                .map(p -> new Point(Math.abs(p.getX()), Math.abs(p.getY())))
                .collect(Collectors.toList());

        return new Polyline(result);
    }
}
