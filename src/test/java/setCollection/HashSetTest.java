package setCollection;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        //Создали объект hashSet
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("JavaScript");
        hashSet.add("Java"); // Этот элемент не будет добавлен, так как он уже присутствует

        //Сохранился порядок вставки элементов по алфавитному порядку
        System.out.println("Содержимое HashSet : " + hashSet);

        // Проверяем наличие элемента
        String language = "Java";
        if (hashSet.contains(language)) {
            System.out.println(language + " присутствует в HashSet");
        } else {
            System.out.println(language + " отсутствует в HashSet");
        }
    }
}



