package de.telran.module_2.lesson_11;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new TreeMap<>();
        System.out.println(map1.put(2, "Наша 2"));
        map1.put(1, "Наша 1");
        map1.put(5, "Наша 5");
        map1.put(3, "Наша 3"); // добавление данных
//        map1.put(null, "Наш null"); // нельзя использовать null  в качестве ключа
        map1.put(0, "Наш новый 0");
        System.out.println(map1);

        Map<Integer, String> map2  = new TreeMap<>(Comparator.reverseOrder()); // обратная сортировка
        map2.putAll(map1);
        System.out.println(map2);

        //Изменение данных
        System.out.println(map2.put(3, "Наша новая 3")); //изменение существующих данных
        System.out.println(map2);

        map2.put(3, "Наша сверхновая 3");  //изменение существующих данных
        map2.put(4,"Наша 4"); // вставка нового значения
        map2.put(17, "Наша 17");
        System.out.println(map2);

        // Удаление объектов
        System.out.println("Удаление объекта key=3 -> "+map2.remove(3)); // по ключу
        System.out.println(map2);

        System.out.println("Удаление объекта key=2 и value -> "+map2.remove(2, "Наша новая 2")); // по ключу и значению
        System.out.println(map2);

        System.out.println("Удаление объекта key=1 и не правильное value -> "+map2.remove(1, "Не наша 1"));
        System.out.println(map2);

        // Поиск элементов
        System.out.println("Поиск key=1 -> "+map2.get(1));
        System.out.println("Поиск key=11(нет) -> "+map2.get(11));

        System.out.println("Поиск key=11(нет) -> "+map2.getOrDefault(11, "По умолчнию"));

        // === Просмотр

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue()/*+ " ==> "+entry.getClass()*/);
            if(entry.getKey() == 2) entry.setValue("Наша новая 2"); // меняе value
        }

        Set<Integer> setKeys = map2.keySet(); // перечень всех ключей
        System.out.println(setKeys); // перечень ключей

        Collection<String> listValues = map2.values();
        System.out.println(listValues); // перечень value

        // Итератор, потому что entrySet() возвращает Set
        Iterator<Map.Entry<Integer, String>> itMap = map2.entrySet().iterator();
        while (itMap.hasNext()) {
            Map.Entry<Integer, String> entry = itMap.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" -> "+value+" == it");
        }

        // HashMap - порядок хранения не гарантирован
        Map<Integer, String> map4 = new HashMap<>();
        System.out.println(map4.put(2, "Наша 2"));
        map4.put(1, "Наша 1");
        map4.put(5, "Наша 5");
        map4.put(3, "Наша 3"); // добавление данных
        System.out.println(map4);
        map4.put(17, "Наша 17");
        map4.put(null, "Наш null"); // можем добавлять null в отличии от TreeMap
        map4.put(0, "Наш новый 0");
        System.out.println(map4);

        // LinkedHashMap - сохраняется по порядку добаляения
        Map<Integer, String> map3 = new LinkedHashMap<>();
        System.out.println(map3.put(2, "Наша 2"));
        map3.put(1, "Наша 1");
        map3.put(5, "Наша 5");
        map3.put(3, "Наша 3"); // добавление данных
        map3.put(17, "Наша 17");
        map3.put(null, "Наш null");
        map3.put(0, "Наш новый 0");
        System.out.println(map3);

    }
}
