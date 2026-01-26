package Mamontov.App.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Employee2 описывает сотрудника компании.
 * Гарантируется, что начальник работает в том же отделе.
 */
public class Employee3 {

    private String name;
    private String departmentName;
    private Employee3 boss;
    private boolean isBoss;

    private static List<Employee3> allEmployees = new ArrayList<>();

    /**
     * Создаёт сотрудника с именем и отделом.
     *
     * @param name имя сотрудника
     * @param departmentName название отдела
     */
    public Employee3(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.isBoss = false;
        allEmployees.add(this);
    }

    /**
     * Назначает начальника сотруднику.
     * Начальник должен работать в том же отделе.
     *
     * @param boss начальник
     */
    public void setBoss(Employee3 boss) {
        if (boss == null) {
            return;
        }

        if (!this.departmentName.equals(boss.departmentName)) {
            System.out.println("Ошибка: начальник должен быть из того же отдела!");
            return;
        }

        this.boss = boss;
        boss.isBoss = true;
    }

    /**
     * @return имя сотрудника
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает список сотрудников текущего отдела.
     *
     * @return список сотрудников отдела
     */
    public List<Employee3> getDepartmentEmployees() {
        List<Employee3> departmentEmployees = new ArrayList<>();
        for (Employee3 employee : allEmployees) {
            if (employee.departmentName.equals(this.departmentName)) {
                departmentEmployees.add(employee);
            }
        }
        return departmentEmployees;
    }

    @Override
    public String toString() {
        if (isBoss) {
            return name + " — начальник отдела " + departmentName;
        } else if (boss != null) {
            return name + " работает в отделе " + departmentName +
                    ", начальник — " + boss.getName();
        } else {
            return name + " работает в отделе " + departmentName +
                    ", начальник не назначен";
        }
    }

    /**
     * Демонстрация работы класса.
     */
    public static void demo() {
        System.out.println("\nСистема сотрудников");

        allEmployees.clear();

        Employee3 petrov = new Employee3("Петров", "IT");
        Employee3 kozlov = new Employee3("Козлов", "IT");
        Employee3 ivanov = new Employee3("Иванов", "HR");

        petrov.setBoss(kozlov);   // ✔ корректно
        petrov.setBoss(ivanov);   // ❌ ошибка

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(ivanov);
    }
}
