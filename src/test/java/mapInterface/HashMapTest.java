package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        //создали объект map
        Map<String, Integer> map = new HashMap<>();

        map.put("Автомобиль", 15);
        map.put("Велосипед", 5);
        map.put("Мотоцикл", 45);
        map.put("Фура", 2);

        //Значения одинаковыми быть не могут
        map.put("Автомобиль", 15);

        System.out.println(map);
    }
}



