package GasStation;

import java.util.*;

/**
 * Класс для обработки данных автозаправочных станций.
 * Определяет количество АЗС с минимальной ценой
 * для бензина марок 92, 95 и 98.
 */
public class GasStationTask {

    /**
     * Класс записи о заправке.
     */
    static class Record {

        String company;
        String street;
        int brand;
        int price;

        Record(String company, String street, int brand, int price) {
            this.company = company;
            this.street = street;
            this.brand = brand;
            this.price = price;
        }
    }

    /**
     * Основной метод.
     */
    public static void process() {

        List<Record> records = new ArrayList<>();

        records.add(new Record("СибНПЗ", "Цветочная", 95, 59));
        records.add(new Record("ГазПром", "Ленина", 92, 50));
        records.add(new Record("РосНефть", "Мира", 92, 50));
        records.add(new Record("Лукойл", "Советская", 95, 59));
        records.add(new Record("Shell", "Победы", 98, 70));
        records.add(new Record("ТатНефть", "Центральная", 98, 70));

        int[] brands = {92, 95, 98};

        for (int brand : brands) {

            int minPrice = Integer.MAX_VALUE;

            for (Record r : records) {
                if (r.brand == brand) {
                    if (r.price < minPrice) {
                        minPrice = r.price;
                    }
                }
            }

            int count = 0;

            for (Record r : records) {
                if (r.brand == brand && r.price == minPrice) {
                    count++;
                }
            }

            System.out.print(count + " ");
        }

        System.out.println();
    }
}
