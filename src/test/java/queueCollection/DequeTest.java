package queueCollection;
import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
    public static void main(String[] args) {
        // Создаем объект класса LinkedList, который реализует интерфейс Deque
        Deque<String> deque = new LinkedList<>();

        // Добавляем элементы в конец очереди
        deque.addLast("Element 1");
        deque.addLast("Element 2");
        deque.addLast("Element 3");

        // Добавляем элементы в начало очереди
        deque.addFirst("Element 0");
        deque.addFirst("Element -1");

        // Выводим элементы очереди
        System.out.println("Deque elements: " + deque);

        // Удаляем элемент с начала очереди и выводим его
        String firstElement = deque.removeFirst();
        System.out.println("Removed first element: " + firstElement);

    }
}
