package listCollection;

import java.util.LinkedList;

//ниже мы создали класс LinkedList, задали тип данных String, создали объект numbers и выделели память списку
//далее обращаясь к объекту numbers, методом add - мы добавляем элементы
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> numbers = new LinkedList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("Hello");

        //ниже идет цикл, создали переменную num, прировняли ей все значения из numbers, СОУТом мы вывели переменную numbers
        for (String num : numbers)
            System.out.println(num);
    }
}



