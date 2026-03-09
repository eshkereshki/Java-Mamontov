import java.util.Scanner;

/**
 * Главный класс программы.
 */
public class Main {

    /**
     * Точка входа программы.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1 - Задание @Invoke");
            System.out.println("2 - Задание @Default");
            System.out.println("3 - Задание @ToString");
            System.out.println("4 - Задание @Validate");
            System.out.println("5 - Задание @Two");
            System.out.println("6 - Задание @Cache");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n=== Задание 1: @Invoke ===");
                    TestClass test = new TestClass();
                    InvokeProcessor.process(test);
                    break;

                case 2:
                    System.out.println("\n=== Задание 2: @Default ===");
                    DefaultProcessor.process(DefaultAnnotatedClass.class);
                    break;

                case 3:
                    System.out.println("\n=== Задание 3: @ToString ===");
                    Person person = new Person("Иван", 20, "12345");
                    System.out.println(ToStringProcessor.buildToString(person));
                    break;

                case 4:
                    System.out.println("\n=== Задание 4: @Validate ===");
                    ValidateProcessor.process(ValidatedClass.class);
                    break;

                case 5:
                    System.out.println("\n=== Задание 5: @Two ===");
                    TwoProcessor.process(TwoAnnotatedClass.class);
                    break;

                case 6:
                    System.out.println("\n=== Задание 6: @Cache ===");
                    CacheProcessor.process(CacheAnnotatedClass.class);
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
