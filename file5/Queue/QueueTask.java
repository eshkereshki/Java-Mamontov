package Queue;

import java.util.*;

/**
 * Класс, демонстрирующий работу с очередью (Queue).
 */
public class QueueTask {

    /**
     * Создает очередь, добавляет в нее элементы,
     * выводит очередь и удаляет первый элемент.
     */
    public static void process() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Очередь: " + queue);

        queue.poll();

        System.out.println("После удаления: " + queue);
    }
}
