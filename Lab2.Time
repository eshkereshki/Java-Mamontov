### Time.java
```java
class Time {
    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        int totalSeconds = seconds % (24 * 3600);
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int secs = totalSeconds % 60;

        return String.format("%d:%02d:%02d", hours, minutes, secs);
    }

    public static void demo() {
        System.out.println("\n Время");

        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println("10 секунд: " + time1.toString());
        System.out.println("10000 секунд: " + time2.toString());
        System.out.println("100000 секунд: " + time3.toString());
    }
}
```
