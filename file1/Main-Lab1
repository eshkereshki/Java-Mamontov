### Main.java
```java
import java.util.Scanner;

/**
 * Главный класс программы.
 * Содержит меню для запуска заданий 1.1 – 4.9.
 */
public class Main {

    /**
     * Точка входа в программу.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Test t = new Test();

        while (true) {

            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1  - 1.1");
            System.out.println("2  - 1.3");
            System.out.println("3  - 1.5");
            System.out.println("4  - 1.7");
            System.out.println("5  - 1.9");
            System.out.println("6  - 2.1");
            System.out.println("7  - 2.3");
            System.out.println("8  - 2.5");
            System.out.println("9  - 2.7");
            System.out.println("10 - 2.9");
            System.out.println("11 - 3.1");
            System.out.println("12 - 3.3");
            System.out.println("13 - 3.5");
            System.out.println("14 - 3.7");
            System.out.println("15 - 3.9");
            System.out.println("16 - 4.1");
            System.out.println("17 - 4.3");
            System.out.println("18 - 4.5");
            System.out.println("19 - 4.7");
            System.out.println("20 - 4.9");
            System.out.println("0  - Выход");
            System.out.print("Ваш выбор: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ошибка! Введите число.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                
                /* 1.1 */
                case 1: {
                    while (true) {
                        try {
                            System.out.print("Введите вещественное число: ");
                            double x = scanner.nextDouble();
                            if (x % 1 == 0) {
                                System.out.println("Нужно вещественное число!");
                                continue;
                            }
                            System.out.println("Дробная часть = " + t.fraction(x));
                            break;
                        } catch (Exception e) {
                            System.out.println("Ошибка ввода!");
                            scanner.nextLine();
                        }
                    }
                    break;
                }
                
                /* 1.3 */
                case 2: {
                    while (true) {
                        try {
                            System.out.print("Введите число от 0 до 9: ");
                            int x = scanner.nextInt();
                            if (x < 0 || x > 9) {
                                System.out.println("Диапазон 0–9!");
                                continue;
                            }
                            char ch = (char) (x + '0');
                            System.out.println("Результат = " + t.charToNum(ch));
                            break;
                        } catch (Exception e) {
                            System.out.println("Ошибка ввода!");
                            scanner.nextLine();
                        }
                    }
                    break;
                }
                
                /* 1.5 */
                case 3: {
                    try {
                        System.out.print("Введите число: ");
                        int x = scanner.nextInt();
                        System.out.println(t.is2Digits(x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 1.7 */
                case 4: {
                    try {
                        System.out.print("Введите a: ");
                        int a = scanner.nextInt();
                        System.out.print("Введите b: ");
                        int b = scanner.nextInt();
                        System.out.print("Введите num: ");
                        int num = scanner.nextInt();
                        System.out.println(t.isInRange(a, b, num));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 1.9 */
                case 5: {
                    try {
                        System.out.print("Введите a: ");
                        int a = scanner.nextInt();
                        System.out.print("Введите b: ");
                        int b = scanner.nextInt();
                        System.out.print("Введите c: ");
                        int c = scanner.nextInt();
                        System.out.println(t.isEqual(a, b, c));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 2.1 */
                case 6: {
                    try {
                        System.out.print("Введите число: ");
                        int x = scanner.nextInt();
                        System.out.println("Модуль = " + t.abs(x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 2.3 */
                case 7: {
                    try {
                        System.out.print("Введите число: ");
                        int x = scanner.nextInt();
                        System.out.println(t.is35(x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 2.5 */
                case 8: {
                    try {
                        System.out.print("Введите x: ");
                        int x = scanner.nextInt();
                        System.out.print("Введите y: ");
                        int y = scanner.nextInt();
                        System.out.print("Введите z: ");
                        int z = scanner.nextInt();
                        System.out.println("Максимум = " + t.max3(x, y, z));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 2.7 */
                case 9: {
                    try {
                        System.out.print("Введите x: ");
                        int x = scanner.nextInt();
                        System.out.print("Введите y: ");
                        int y = scanner.nextInt();
                        System.out.println("Сумма = " + t.sum2(x, y));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 2.9 */
                case 10: {
                    try {
                        System.out.print("Введите номер дня (1–7): ");
                        int d = scanner.nextInt();
                        System.out.println(t.day(d));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 3.1 */
                case 11: {
                    try {
                        System.out.print("Введите x: ");
                        int x = scanner.nextInt();
                        System.out.println(t.listNums(x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 3.3 */
                case 12: {
                    try {
                        System.out.print("Введите x: ");
                        int x = scanner.nextInt();
                        System.out.println(t.chet(x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 3.5 */
                case 13: {
                    try {
                        System.out.print("Введите число: ");
                        long x = scanner.nextLong();
                        System.out.println("Количество цифр = " + t.numLen(x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 3.7 */
                case 14: {
                    try {
                        System.out.print("Введите размер квадрата: ");
                        int s = scanner.nextInt();
                        if (s > 0) t.square(s);
                        else System.out.println("Размер должен быть > 0!");
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 3.9 */
                case 15: {
                    try {
                        System.out.print("Введите высоту треугольника: ");
                        int h = scanner.nextInt();
                        if (h > 0) t.rightTriangle(h);
                        else System.out.println("Высота должна быть > 0!");
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }
                
                /* 4.1 */
                case 16: {
                    try {
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];

                        for (int i = 0; i < size; i++) {
                            System.out.print("Элемент " + (i + 1) + ": ");
                            arr[i] = scanner.nextInt();
                        }

                        System.out.print("Введите число: ");
                        int x = scanner.nextInt();

                        System.out.println("Результат = " + t.findFirst(arr, x));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }

                /* 4.3 */
                case 17: {
                    try {
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];

                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }

                        System.out.println("Максимум по модулю = " + t.maxAbs(arr));
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }

                /* 4.5 */
                case 18: {
                    try {
                        System.out.print("Размер первого массива: ");
                        int s1 = scanner.nextInt();
                        int[] arr = new int[s1];

                        for (int i = 0; i < s1; i++) arr[i] = scanner.nextInt();

                        System.out.print("Размер второго массива: ");
                        int s2 = scanner.nextInt();
                        int[] ins = new int[s2];

                        for (int i = 0; i < s2; i++) ins[i] = scanner.nextInt();

                        System.out.print("Позиция: ");
                        int pos = scanner.nextInt();

                        int[] res = t.add(arr, ins, pos);

                        for (int x : res) System.out.print(x + " ");
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }

                /* 4.7 */
                case 19: {
                    try {
                        System.out.print("Размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];

                        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();

                        int[] res = t.reverseBack(arr);

                        for (int x : res) System.out.print(x + " ");
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }

                /* 4.9 */
                case 20: {
                    try {
                        System.out.print("Размер массива: ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];

                        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();

                        System.out.print("Введите число: ");
                        int x = scanner.nextInt();

                        int[] res = t.findAll(arr, x);

                        for (int i : res) System.out.print(i + " ");
                        System.out.println();

                    } catch (Exception e) {
                        System.out.println("Ошибка ввода!");
                        scanner.nextLine();
                    }
                    break;
                }

                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Такого пункта нет!");
            }

            System.out.println("\nНажмите Enter для продолжения...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
```
