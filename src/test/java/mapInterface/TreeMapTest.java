package mapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("Автомобиль", 15);
        map.put("Велосипед", 5);
        map.put("Мотоцикл", 45);
        map.put("Фура", 2);

        //Сохранился порядок вставки элементов по алфавитному порядку
        System.out.println(map);
    }
}



