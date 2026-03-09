package main;

import java.util.*;

import Cat.Cat;
import Cat.Funs;
import Fraction.Fraction;
import Fraction.CachedFraction;
import GasStation.GasStationTask;
import List.ListTasks;
import Queue.QueueTask;
import StreamName.StreamNameTask;
import StreamPoint.Point;
import StreamPoint.StreamPointTask;
import File.FileTask;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1 - Fraction");
            System.out.println("2 - Cat");
            System.out.println("3 - List");
            System.out.println("4 - Queue");
            System.out.println("5 - GasStation");
            System.out.println("6 - File");
            System.out.println("7 - Stream Polyline");
            System.out.println("8 - Stream Names");
            System.out.println("0 - Выход");

            System.out.print("Выберите пункт: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Введите число!");
                continue;
            }

            switch (choice) {

                case 1:
                    Fraction f = new CachedFraction(1, -2);
                    System.out.println(f);
                    System.out.println(f.getDoubleValue());
                    break;

                case 2:
                    Cat c1 = new Cat("Барсик");
                    Cat c2 = new Cat("Мурзик");
                    Funs.meowsCare(c1, c2, c1);
                    System.out.println("Барсик мяукал: " + c1.getMeowCount());
                    break;

                case 3:
                    List<Integer> L = new ArrayList<>(List.of(1, 2, 3, 4, 2, 3));
                    ListTasks.replaceFirstOccurrence(
                            L,
                            List.of(2, 3),
                            List.of(9, 9)
                    );
                    System.out.println(L);
                    break;

                case 4:
                    QueueTask.process();
                    break;

                case 5:
                    GasStationTask.process(scanner);
                    break;

                case 6:
                    FileTask.process("src/File/ABC.txt");
                    break;

                case 7:
                    List<Point> pts = List.of(
                            new Point(-1, -2),
                            new Point(3, 4),
                            new Point(-1, -2),
                            new Point(2, -5)
                    );
                    System.out.println(StreamPointTask.build(pts));
                    break;

                case 8:
                    try {
                        StreamNameTask.process("src/StreamName/Name.txt");
                    } catch (Exception e) {
                        System.out.println("Ошибка при обработке файла: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Выход...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный пункт меню!");
            }
        }
    }
}
