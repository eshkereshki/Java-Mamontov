package Mamontov.App.Employee;

/**
 * Класс Department описывает отдел.
 * Гарантирует, что начальник работает в этом же отделе.
 */
public class Department {

    private final String name;
    private EmployeeTrust boss;

    public Department(String name) {
        this.name = name;
    }

    /**
     * Назначает начальника отдела.
     *
     * @param boss сотрудник этого отдела
     */
    public void setBoss(EmployeeTrust boss) {
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public EmployeeTrust getBoss() {
        return boss;
    }
}
