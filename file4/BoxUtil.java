/**
 * Класс для демонстрации работы с wildcards.
 */
public class BoxUtil {

    /**
     * Кладёт трёхмерную точку в коробку.
     *
     * Метод принимает Box с типом Point3D
     * или любым его родителем (например Object).
     *
     * @param box коробка для точки
     */
    public static void putPoint(
            Box<? super Point3D> box) {

        Point3D point = new Point3D(1.0, 2.0, 3.0);
        box.put(point);
    }
}
