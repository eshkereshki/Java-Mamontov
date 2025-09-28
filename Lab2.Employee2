### Employee2.java
```java
import java.util.ArrayList;
import java.util.List;

class Employee2 {
    private String name;
    private String departmentName;
    private Employee2 boss;
    private boolean isBoss;
    private static List<Employee2> allEmployees = new ArrayList<>();

    public Employee2(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.isBoss = false;
        allEmployees.add(this);
    }

    public void setBoss(Employee2 boss) {
        this.boss = boss;
        boss.isBoss = true;
    }

    public String getName() { return name; }

    public List<Employee2> getDepartmentEmployees() {
        List<Employee2> departmentEmployees = new ArrayList<>();
        for (Employee2 employee : allEmployees) {
            if (employee.departmentName.equals(this.departmentName)) {
                departmentEmployees.add(employee);
            }
        }
        return departmentEmployees;
    }

    @Override
    public String toString() {
        if (isBoss) {
            return name + " начальник отдела " + departmentName;
        } else if (boss != null) {
            return name + " работает в отделе " + departmentName + ", начальник которого " + boss.getName();
        } else {
            return name + " работает в отделе " + departmentName + ", начальник которого не назначен";
        }
    }

    public static void demo() {
        System.out.println("\n Система сотрудников (расширение)");

        allEmployees.clear();

        Employee2 petrov = new Employee2("Петров", "IT");
        Employee2 kozlov = new Employee2("Козлов", "IT");
        Employee2 sidorov = new Employee2("Сидоров", "IT");

        petrov.setBoss(kozlov);
        sidorov.setBoss(kozlov);

        System.out.println("Информация о сотрудниках:");
        System.out.println(petrov.toString());
        System.out.println(kozlov.toString());
        System.out.println(sidorov.toString());

        System.out.println("\nСписок всех сотрудников отдела IT:");
        List<Employee2> itEmployees = kozlov.getDepartmentEmployees();
        for (Employee2 employee : itEmployees) {
            System.out.println("- " + employee.getName());
        }
    }
}
```
