### Time2.java
```java
/**
 * Класс Time2 — расширенная версия работы со временем.
 * Позволяет создавать объект времени как через секунды,
 * так и через часы, минуты и секунды.
 */
class Time2 {

    /** Количество секунд (в пределах суток) */
    private int seconds;

    /**
     * Создаёт объект времени на основе секунд.
     * Значение приводится к диапазону одних суток.
     */
    public Time2(int seconds) {
        this.seconds = seconds % (24 * 3600);
    }

    /**
     * Создаёт объект времени на основе часов, минут и секунд.
     * Значение приводится к диапазону одних суток.
     */
    public Time2(int hours, int minutes, int seconds) {
        this.seconds = (hours * 3600 + minutes * 60 + seconds)
                % (24 * 3600);
    }

    /**
     * Преобразует время в строковый формат ЧЧ:ММ:СС.
     */
    @Override
    public String toString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;

        return String.format("%d:%02d:%02d", hours, minutes, secs);
    }

    /**
     * Демонстрационный метод.
     * Показывает разные способы создания времени.
     */
    public static void demo() {
        System.out.println("\n Время (расширение)");

        Time2 time1 = new Time2(10000);
        Time2 time2 = new Time2(2, 3, 5);

        System.out.println("10000 секунд: " + time1);
        System.out.println("2 часа 3 минуты 5 секунд: " + time2);
    }
}
```
