package List;

import java.util.List;

/**
 * Класс с задачами для работы со списками.
 */
public class ListTasks {

    /**
     * Заменяет первое вхождение подсписка L1 в списке L на список L2.
     * Если подсписок L1 не найден, список L остается без изменений.
     *
     * @param <T> тип элементов списка
     * @param L основной список, в котором выполняется замена
     * @param L1 подсписок, который нужно найти
     * @param L2 подсписок, на который производится замена
     */
    public static <T> void replaceFirstOccurrence(List<T> L, List<T> L1, List<T> L2) {
        int index = indexOfSubList(L, L1);
        if (index != -1) {
            for (int i = 0; i < L1.size(); i++) {
                L.remove(index);
            }
            L.addAll(index, L2);
        }
    }

    /**
     * Находит индекс первого вхождения подсписка target в списке source.
     *
     * @param <T> тип элементов списка
     * @param source список, в котором производится поиск
     * @param target подсписок, который нужно найти
     * @return индекс первого вхождения подсписка или -1, если подсписок не найден
     */
    private static <T> int indexOfSubList(List<T> source, List<T> target) {
        for (int i = 0; i <= source.size() - target.size(); i++) {
            boolean found = true;
            for (int j = 0; j < target.size(); j++) {
                if (!source.get(i + j).equals(target.get(j))) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
        return -1;
    }
}
