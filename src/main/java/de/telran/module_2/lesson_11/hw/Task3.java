package de.telran.module_2.lesson_11.hw;

import java.util.*;

//  3)* Найти маршрут из заданного списка билетов, желательно используя Map.
//      Учитывая список билетов, найти маршрут по порядку, используя данный список.
//      Вход:
//      «Berlin» -> «London»
//      «Tokyo» -> «Seoul»
//      «Mumbai» -> «Berlin»
//      «Seoul» -> «Mumbai»
//      Выход:
//      Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London
public class Task3 {
        public static void main(String[] args) {

            Map<String, String> tickets = new HashMap<>();
            tickets.put("Berlin", "London");
            tickets.put("Tokyo", "Seoul");
            tickets.put("Mumbai", "Berlin");
            tickets.put("Seoul", "Mumbai");

            System.out.println("Маршрут построен: " +  buildRoute(tickets));
        }

        public static Map<String, String> buildRoute(Map<String, String> tickets) {
            List<String> valueList = new ArrayList(tickets.values());
            // находим точку отправления
            String keyTemp = null;
            for (Map.Entry<String, String> entry : tickets.entrySet()) {
                if (!valueList.contains(entry.getKey())) {
                    keyTemp = entry.getKey();
                }
            }
            // строим весь маршрут, начиная от точки отправления
            Map<String, String> route = new LinkedHashMap<>();
            for (Map.Entry<String, String> entry : tickets.entrySet()) {
                route.put(keyTemp, tickets.get(keyTemp));
                keyTemp = tickets.get(keyTemp);
            }
            return route;
        }
}
