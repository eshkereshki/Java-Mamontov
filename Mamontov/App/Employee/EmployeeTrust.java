package Mamontov.App.Employee;

/**
 * Класс EmployeeTrust описывает сотрудника.
 * Сотрудник всегда принадлежит одному отделу.
 */
public class EmployeeTrust {

    private final String name;
    private final Department department;

    /**
     * Создаёт сотрудника и сразу привязывает его к отделу.
     *
     * @param name имя сотрудника
     * @param department отдел
     */
    public EmployeeTrust(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        if (department.getBoss() == this) {
            return name + " — начальник отдела " + department.getName();
        }
        return name + " работает в отделе " + department.getName() +
                ", начальник — " +
                (department.getBoss() != null ? department.getBoss().getName() : "не назначен");
    }
}
