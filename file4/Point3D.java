/**
 * Класс, представляющий трёхмерную точку.
 */
public class Point3D {

    private final double x;
    private final double y;
    private final double z;

    /**
     * Создаёт точку с заданными координатами.
     */
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D(" + x + ", " + y + ", " + z + ")";
    }
}
