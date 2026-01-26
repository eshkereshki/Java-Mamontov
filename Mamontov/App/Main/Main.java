package Mamontov.App.Main;

import Mamontov.App.Birds.*;
import Mamontov.App.Employee.Employee3;
import Mamontov.App.Time.Time4;
import Mamontov.App.Tree.BinTree;
import Mamontov.App.geometry.*;
import Mamontov.App.MathUtil.Power;
import Mamontov.App.Employee.Department;
import Mamontov.App.Employee.EmployeeTrust;


import java.util.Scanner;

/**
 * Главный класс программы.
 * Содержит меню для запуска всех заданий.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> pointDemo();
                case 2 -> point3DDemo();
                case 3 -> pointComparisonDemo();
                case 4 -> timeDemo();
                case 5 -> employeeDemo();
                case 6 -> birdsDemo();
                case 7 -> birdMarketDemo();
                case 8 -> binTreeDemo();
                case 9 -> powerDemo(args);
                case 10 -> departmentTrustDemo();
                case 0 -> System.out.println("Выход из программы.");
                default -> System.out.println("Неверный пункт меню.");
            }

            System.out.println();
        } while (choice != 0);
    }

    private static void printMenu() {
        System.out.println("=== МЕНЮ ===");
        System.out.println("1 - Точка (1.1.1)");
        System.out.println("2 - Трёхмерная точка");
        System.out.println("3 - Сравнение точек");
        System.out.println("4 - Время (начало суток)");
        System.out.println("5 - Сотрудники");
        System.out.println("6 - Птицы");
        System.out.println("7 - Птичий рынок");
        System.out.println("8 - Бинарное дерево");
        System.out.println("9 - Возведение в степень");
        System.out.println("10 - Отделы доверяют начальникам");
        System.out.println("0 - Выход");
        System.out.print("Выберите пункт: ");
    }

    /* =================== ЗАДАНИЯ =================== */

    private static void pointDemo() {
        System.out.println("=== Точка (1.1.1) ===");

        Point p1 = new Point(3, 5);
        Point p2 = new Point(25, 6);
        Point p3 = new Point(7, 8);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    private static void point3DDemo() {
        System.out.println("=== Трёхмерная точка ===");

        Point3D point = new Point3D(1, 2, 3);
        System.out.println(point);
    }

    private static void pointComparisonDemo() {
        System.out.println("=== Сравнение точек ===");

        PointComp p1 = new PointComp(3, 5);
        PointComp p2 = new PointComp(3, 5);
        PointComp p3 = new PointComp(7, 8);

        System.out.println(p1 + " == " + p2 + " ? " + p1.equals(p2));
        System.out.println(p1 + " == " + p3 + " ? " + p1.equals(p3));
    }

    private static void timeDemo() {
        System.out.println("=== Время (начало суток) ===");

        Time4 time1 = new Time4(34056);
        Time4 time2 = new Time4(4532);
        Time4 time3 = new Time4(123);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    private static void employeeDemo() {
        System.out.println("=== Сотрудники ===");

        Employee3.demo();
    }

    private static void birdsDemo() {
        System.out.println("=== Птицы ===");

        Bird[] birds = {
                new Sparrow(),
                new Chicken(),
                new Parrot("Привет")
        };

        for (Bird bird : birds) {
            bird.sing();
        }
    }

    private static void birdMarketDemo() {
        System.out.println("=== Птичий рынок ===");

        Bird[] birds = {
                new Sparrow(),
                new Chicken(),
                new Parrot("Java")
        };

        BirdMarket.makeBirdsSing(birds);
    }

    private static void binTreeDemo() {
        System.out.println("=== Бинарное дерево ===");

        BinTree tree = new BinTree();
        tree.add(3);
        tree.add(5);
        tree.add(4);
        tree.add(7);
        tree.add(1);
        tree.add(2);

        System.out.println(tree);
    }
    private static void powerDemo(String[] args) {
        System.out.println("=== Возведение в степень ===");

        String x;
        String y;

        if (args.length >= 2) {
            x = args[0];
            y = args[1];
        } else {
            x = "2";
            y = "5";
            System.out.println("Параметры не переданы, используются значения по умолчанию: 2 и 5");
        }

        double result = Mamontov.App.MathUtil.Power.pow(x, y);
        System.out.println(x + " ^ " + y + " = " + result);
    }
    private static void departmentTrustDemo() {
        System.out.println("=== Отделы доверяют начальникам ===");

        Department it = new Department("IT");

        EmployeeTrust petrov = new EmployeeTrust("Петров", it);
        EmployeeTrust kozlov = new EmployeeTrust("Козлов", it);

        it.setBoss(kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
    }



}
