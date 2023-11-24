package setCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

        public static void main(String[] args) {
            // Создаем объект linkedHashSet
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

            // Добавляем элементы
            linkedHashSet.add("SomeTest");
            linkedHashSet.add("Java");
            linkedHashSet.add("Python");
            linkedHashSet.add("C++");
            linkedHashSet.add("Java"); // Повторяющийся элемент, не будет добавлен

            // Выводим элементы
            System.out.println("Элементы LinkedHashSet: " + linkedHashSet);

            // Проверяем наличие элемента
            System.out.println("Содержит Java? " + linkedHashSet.contains("Java"));
    }
}





