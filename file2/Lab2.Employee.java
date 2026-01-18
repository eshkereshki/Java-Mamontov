### Employee.java
```java
/**
 * Класс Employee описывает сотрудника организации.
 * Сотрудник принадлежит отделу, может иметь начальника
 * или сам являться начальником отдела.
 */
class Employee {

    /** Имя сотрудника */
    private String name;

    /** Название отдела */
    private String departmentName;

    /** Начальник сотрудника (может быть не назначен) */
    private Employee boss;

    /** Флаг, указывающий, является ли сотрудник начальником */
    private boolean isBoss;

    /**
     * Создаёт нового сотрудника с указанным именем и отделом.
     */
    public Employee(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.isBoss = false;
    }

    /**
     * Назначает начальника для сотрудника.
     * Назначенный сотрудник автоматически помечается как начальник.
     */
    public void setBoss(Employee boss) {
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
     * Возвращает название отдела сотрудника.
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Возвращает начальника сотрудника.
     */
    public Employee getBoss() {
        return boss;
    }

    /**
     * Проверяет, является ли сотрудник начальником.
     */
    public boolean isBoss() {
        return isBoss;
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
     * Показывает работу системы сотрудников.
     */
    public static void demo() {
        System.out.println("\n Система сотрудников");

        Employee petrov = new Employee("Петров", "IT");
        Employee kozlov = new Employee("Козлов", "IT");
        Employee sidorov = new Employee("Сидоров", "IT");

        petrov.setBoss(kozlov);
        sidorov.setBoss(kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }
}

```
