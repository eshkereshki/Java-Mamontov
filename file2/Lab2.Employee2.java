### Employee2.java
```java
import java.util.ArrayList;
import java.util.List;

/**
 * Класс Employee2 — расширенная версия системы сотрудников.
 * Хранит общий список всех сотрудников и позволяет получать
 * сотрудников одного отдела.
 */
class Employee2 {

    /** Имя сотрудника */
    private String name;

    /** Название отдела */
    private String departmentName;

    /** Начальник сотрудника */
    private Employee2 boss;

    /** Флаг, указывающий, является ли сотрудник начальником */
    private boolean isBoss;

    /** Список всех созданных сотрудников */
    private static List<Employee2> allEmployees = new ArrayList<>();

    /**
     * Создаёт нового сотрудника и добавляет его в общий список.
     */
    public Employee2(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.isBoss = false;
        allEmployees.add(this);
    }

    /**
     * Назначает начальника для сотрудника.
     * Назначенный сотрудник автоматически помечается как начальник.
     */
    public void setBoss(Employee2 boss) {
        this.boss = boss;
        boss.isBoss = true;
    }

    /**
     * Возвращает имя сотрудника.
     */
    public String getName() {
        return name;
    }

    /**
     * Формирует список всех сотрудников,
     * работающих в том же отделе.
     */
    public List<Employee2> getDepartmentEmployees() {
        List<Employee2> departmentEmployees = new ArrayList<>();

        for (Employee2 employee : allEmployees) {
            if (employee.departmentName.equals(this.departmentName)) {
                departmentEmployees.add(employee);
            }
        }

        return departmentEmployees;
    }

    /**
     * Формирует строковое представление сотрудника
     * в зависимости от его роли в отделе.
     */
    @Override
    public String toString() {
        if (isBoss) {
            return name + " начальник отдела " + departmentName;
        } else if (boss != null) {
            return name + " работает в отделе " + departmentName +
                    ", начальник которого " + boss.getName();
        } else {
            return name + " работает в отделе " + departmentName +
                    ", начальник которого не назначен";
        }
    }

    /**
     * Демонстрационный метод.
     * Показывает расширенную систему сотрудников
     * и выводит список сотрудников одного отдела.
     */
    public static void demo() {
        System.out.println("\n Система сотрудников (расширение)");

        // Очистка списка сотрудников
        allEmployees.clear();

        Employee2 petrov = new Employee2("Петров", "IT");
        Employee2 kozlov = new Employee2("Козлов", "IT");
        Employee2 sidorov = new Employee2("Сидоров", "IT");

        petrov.setBoss(kozlov);
        sidorov.setBoss(kozlov);

        System.out.println("Информация о сотрудниках:");
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);

        System.out.println("\nСписок всех сотрудников отдела IT:");
        List<Employee2> itEmployees = kozlov.getDepartmentEmployees();
        for (Employee2 employee : itEmployees) {
            System.out.println("- " + employee.getName());
        }
    }
}

```
