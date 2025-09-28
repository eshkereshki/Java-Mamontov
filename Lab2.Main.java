### Main.java
```java
import java.util.Scanner;

public class Main {
    private Scanner scanner;

    public Main() {
        this.scanner = new Scanner(System.in);
    }


    public void run() {

        while (true) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Name.demo();
                    break;
                case "2":
                    Time.demo();
                    break;
                case "3":
                    Time2.demo();
                    break;
                case "4":
                    Time3.demo();
                    break;
                case "5":
                    Employee.demo();
                    break;
                case "6":
                    Employee2.demo();
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            pause();
        }
    }

    private void showMenu() {
        System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
        System.out.println("1. Name - Имена");
        System.out.println("2. Time - Время");
        System.out.println("3. Time2 - Время (расширение)");
        System.out.println("4. Time3 - Время (расширение 2)");
        System.out.println("5. Employee - Система сотрудников");
        System.out.println("6. Employee2 - Система сотрудников (расширение)");
        System.out.println("0. Выход");
        System.out.print("Выберите программу: ");
    }

    private void pause() {
        System.out.print("\nНажмите Enter для продолжения");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
```
