package listCollection;

import java.util.ArrayList;

//ниже мы создали класс ArrayList, задали тип данных Integer, создали объект nums и выделели память списку
//далее обращаясь к объекту nums, методом add - мы добавляем элементы
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(56);
        nums.add(51);
        nums.add(1, 13);
//      nums.remove(1); - эта функкция удаляет элемент по индексу
//      nums.clear(); - эта функкция очищает список массивов
//      nums.set(0, 10);- эта функкция заменяет значение элемента по индексу

        //ниже идет цикл, создали переменную num, прировняли ей все значения из nums, СОУТом мы вывели переменную num
        for(int num : nums)
            System.out.println(num);
    }
}

