package setCollection;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // Создаем TreeSet для хранения элементов типа String
        TreeSet<String> treeSet = new TreeSet<>();

        // Добавляем элементы в TreeSet
        treeSet.add("Яблоко");
        treeSet.add("Груша");
        treeSet.add("Банан");
        treeSet.add("Апельсин");
        treeSet.add("Манго");

        // Выводим элементы TreeSet, они будут отсортированы по алфавиту
        System.out.println("Элементы TreeSet: " + treeSet);

        // Удаление элемента из TreeSet
        treeSet.remove("Банан");

        // Выводим обновленные элементы TreeSet
        System.out.println("Обновленные элементы TreeSet после удаления: " + treeSet);
    }
}
