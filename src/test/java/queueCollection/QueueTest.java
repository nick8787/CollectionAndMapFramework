package queueCollection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // Создаем объект очереди
        Queue<String> queue = new LinkedList<>();

        // Добавляем элементы в очередь
        queue.offer("Элемент 1");
        queue.offer("Элемент 2");
        queue.offer("Элемент 3");

        // Печатаем содержимое очереди
        System.out.println("Очередь после добавления элементов: " + queue);

        // Извлекаем и печатаем первый элемент очереди
        String firstElement = queue.poll();
        System.out.println("Извлеченный элемент: " + firstElement);

        // Печатаем содержимое очереди после извлечения элемента
        System.out.println("Очередь после извлечения элемента: " + queue);

        // Получаем, но не удаляем первый элемент очереди
        String peekedElement = queue.peek();
        System.out.println("Полученный, но не удаленный элемент: " + peekedElement);

        // Печатаем содержимое очереди после операции peek()
        System.out.println("Очередь после операции peek(): " + queue);
    }
}
