### Time2.java
```java
class Time2 {
    private int seconds;

    public Time2(int seconds) {
        this.seconds = seconds % (24 * 3600);
    }

    public Time2(int hours, int minutes, int seconds) {
        this.seconds = (hours * 3600 + minutes * 60 + seconds) % (24 * 3600);
    }

    @Override
    public String toString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, secs);
    }

    public static void demo() {
        System.out.println("\n Время (расширение)");

        Time2 time1 = new Time2(10000);
        Time2 time2 = new Time2(2, 3, 5);

        System.out.println("10000 секунд: " + time1.toString());
        System.out.println("2 часа 3 минуты 5 секунд: " + time2.toString());
    }
}
```
