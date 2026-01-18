### Name.java
```java
/**
 * Класс Name предназначен для хранения и корректного
 * отображения полного имени человека.
 * Поддерживает отсутствие отдельных частей имени.
 */
class Name {

    /** Фамилия */
    private String lastName;

    /** Имя */
    private String firstName;

    /** Отчество */
    private String middleName;

    /**
     * Создаёт объект имени человека.
     */
    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    /**
     * Формирует строковое представление имени.
     * В строку включаются только непустые части имени.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            result.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(firstName);
        }

        if (middleName != null && !middleName.isEmpty()) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(middleName);
        }

        return result.toString();
    }

    /**
     * Демонстрационный метод.
     * Показывает различные варианты формирования имени.
     */
    public static void demo() {
        System.out.println("\n Имена");

        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println("Результат 1: " + name1);
        System.out.println("Результат 2: " + name2);
        System.out.println("Результат 3: " + name3);
    }
}
```
