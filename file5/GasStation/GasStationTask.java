package GasStation;

import java.util.*;

/**
 * Класс, реализующий задачу обработки данных автозаправочных станций.
 * Программа считывает записи о заправках и определяет,
 * сколько заправок имеют минимальную цену для каждой марки бензина.
 */
public class GasStationTask {

    /**
     * Класс записи о заправке.
     * Хранит компанию, улицу, марку бензина и цену.
     */
    static class Record {

        /** Название компании */
        String company;

        /** Улица расположения */
        String street;

        /** Марка бензина */
        int brand;

        /** Цена бензина */
        int price;

        /**
         * Создает запись о заправке.
         *
         * @param company название компании
         * @param street улица
         * @param brand марка бензина
         * @param price цена бензина
         */
        Record(String company, String street, int brand, int price) {
            this.company = company;
            this.street = street;
            this.brand = brand;
            this.price = price;
        }
    }

    /**
     * Основной метод обработки данных.
     * Считывает записи о заправках, находит минимальную цену
     * для каждой марки бензина и выводит количество таких заправок.
     *
     * @param scanner объект Scanner для чтения данных с консоли
     */
    public static void process(Scanner scanner) {

        System.out.print("Введите количество записей: ");

        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                System.out.println("Количество должно быть больше 0.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число.");
            return;
        }

        List<Record> records = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println("Введите запись №" + (i + 1) +
                    " (формат: компания улица марка цена):");

            String line = scanner.nextLine();
            String[] parts = line.trim().split("\\s+");

            // проверка количества элементов
            if (parts.length != 4) {
                System.out.println("Ошибка: нужно ввести 4 значения!");
                i--; // повторяем ввод
                continue;
            }

            try {
                String company = parts[0];
                String street = parts[1];
                int brand = Integer.parseInt(parts[2]);
                int price = Integer.parseInt(parts[3]);

                records.add(new Record(company, street, brand, price));

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: марка и цена должны быть числами!");
                i--; // повторяем ввод
            }
        }

        int[] brands = {92, 95, 98};

        System.out.println("Количество заправок с минимальной ценой:");

        for (int brand : brands) {
            OptionalInt minPrice = records.stream()
                    .filter(r -> r.brand == brand)
                    .mapToInt(r -> r.price)
                    .min();

            if (minPrice.isPresent()) {
                long count = records.stream()
                        .filter(r -> r.brand == brand &&
                                r.price == minPrice.getAsInt())
                        .count();
                System.out.print(count + " ");
            } else {
                System.out.print("0 ");
            }
        }

        System.out.println();
    }
}
