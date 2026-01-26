package Mamontov.App.Time;

/**
 * Класс Time3 хранит время в секундах,
 * прошедших с начала суток (00:00:00).
 * <p>
 * Если переданное количество секунд превышает 24 часа,
 * лишние сутки отбрасываются.
 */
public class Time4 {

    /** Количество секунд с начала суток (0–86399) */
    private int seconds;

    /** Количество секунд в сутках */
    private static final int SECONDS_IN_DAY = 24 * 60 * 60;

    /**
     * Создаёт объект времени по количеству секунд с начала суток.
     *
     * @param seconds количество секунд (может быть больше 24 часов)
     */
    public Time4(int seconds) {
        this.seconds = seconds % SECONDS_IN_DAY;
    }

    /**
     * Возвращает количество часов.
     *
     * @return часы (0–23)
     */
    public int getHours() {
        return seconds / 3600;
    }

    /**
     * Возвращает количество минут.
     *
     * @return минуты (0–59)
     */
    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    /**
     * Возвращает количество секунд.
     *
     * @return секунды (0–59)
     */
    public int getSeconds() {
        return seconds % 60;
    }

    /**
     * Возвращает строковое представление времени
     * в формате HH:MM:SS.
     *
     * @return время в виде строки
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                getHours(), getMinutes(), getSeconds());
    }

    /**
     * Демонстрирует работу класса Time3.
     */
    public static void demo() {
        System.out.println("\nВремя от начала суток");

        Time4 time1 = new Time4(34056);
        Time4 time2 = new Time4(4532);
        Time4 time3 = new Time4(123);
        Time4 time4 = new Time4(90000); // больше 24 часов

        System.out.println("\n34056 секунд:");
        System.out.println("Время: " + time1);

        System.out.println("\n4532 секунд:");
        System.out.println("Время: " + time2);

        System.out.println("\n123 секунд:");
        System.out.println("Время: " + time3);

        System.out.println("\n90000 секунд (проверка > 24 часов):");
        System.out.println("Время: " + time4);
    }
}
