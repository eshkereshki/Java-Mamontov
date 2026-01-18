### Time3.java
```java
/**
 * Класс Time3 — расширенная версия работы со временем.
 * Позволяет получать отдельные компоненты времени:
 * часы, минуты и секунды.
 */
class Time3 {

    /** Количество секунд (в пределах суток) */
    private int seconds;

    /**
     * Создаёт объект времени на основе секунд.
     * Значение приводится к диапазону одних суток.
     */
    public Time3(int seconds) {
        this.seconds = seconds % (24 * 3600);
    }

    /**
     * Возвращает количество часов.
     */
    public int getHours() {
        return seconds / 3600;
    }

    /**
     * Возвращает количество минут.
     */
    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    /**
     * Возвращает количество секунд.
     */
    public int getSeconds() {
        return seconds % 60;
    }

    /**
     * Преобразует время в строковый формат ЧЧ:ММ:СС.
     */
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d",
                getHours(), getMinutes(), getSeconds());
    }

    /**
     * Демонстрационный метод.
     * Показывает работу методов доступа к компонентам времени.
     */
    public static void demo() {
        System.out.println("\n Время (расширение 2)");

        Time3 time1 = new Time3(34056);
        Time3 time2 = new Time3(4532);
        Time3 time3 = new Time3(123);

        System.out.println("34056 секунд:");
        System.out.println("  Полное время: " + time1);
        System.out.println("  Часы: " + time1.getHours());
        System.out.println("  Минуты: " + time1.getMinutes());
        System.out.println("  Секунды: " + time1.getSeconds());

        System.out.println("\n4532 секунд:");
        System.out.println("  Полное время: " + time2);
        System.out.println("  Минуты: " + time2.getMinutes());

        System.out.println("\n123 секунд:");
        System.out.println("  Полное время: " + time3);
        System.out.println("  Секунды: " + time3.getSeconds());
    }
}
```
