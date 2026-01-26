package Mamontov.App.geometry;

/**
 * Класс Mamontov.App.geometry.Point3D представляет точку в трёхмерном пространстве.
 * Является наследником класса Mamontov.App.geometry.Point.
 */
public class Point3D extends Point {

    private int z;

    /**
     * Создаёт трёхмерную точку.
     *
     * @param x координата X
     * @param y координата Y
     * @param z координата Z
     */
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * @return текстовое представление точки (X;Y;Z)
     */
    @Override
    public String toString() {
        return "(" + x + ";" + y + ";" + z + ")";
    }

    /**
     * Демонстрация работы класса.
     */
    public static void demo() {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(4, 5, 6);
        Point3D p3 = new Point3D(-1, 0, 7);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
