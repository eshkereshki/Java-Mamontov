package Mamontov.App.geometry;

/**
 * Класс Mamontov.App.geometry.PointComp представляет точку на двумерной плоскости
 * с переопределённым сравнением объектов.
 */
public class PointComp {

    private int x;
    private int y;

    /**
     * Создаёт точку с координатами X и Y.
     *
     * @param x координата X
     * @param y координата Y
     */
    public PointComp(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Сравнивает две точки.
     * Точки считаются равными, если их координаты совпадают.
     *
     * @param obj объект для сравнения
     * @return true, если точки равны
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        PointComp point = (PointComp) obj;
        return x == point.x && y == point.y;
    }

    /**
     * Возвращает хеш-код точки.
     *
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    /**
     * @return текстовое представление точки (X;Y)
     */
    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    /**
     * Демонстрация работы класса.
     */
    public static void demo() {
        PointComp p1 = new PointComp(3, 5);
        PointComp p2 = new PointComp(25, 6);
        PointComp p3 = new PointComp(7, 8);
        PointComp p4 = new PointComp(3, 5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\nСравнение точек:");
        System.out.println("p1.equals(p4): " + p1.equals(p4));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
    }
}
