package de.telran.module_2.lesson_10;

import de.telran.module_2.lesson_9.Fly;
import de.telran.module_2.lesson_9.SortFlyByName;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class MainPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(); // стандартная сортировка String для приоритета извлечения
        queue.offer("Маша");
        queue.offer("Петя");
        queue.offer("Паша");
        queue.offer("Миша");
        System.out.println("Добавление offer = "+queue.offer("Гриша"));
        System.out.println(queue);

        System.out.println("Просмотр = "+queue.peek()); //класика Queue (вернет null)
        while (!queue.isEmpty()) {
            System.out.println("Извлечено = "+queue.poll());
        }

        System.out.println();

        // Смена приоритета на обратный
        Comparator<String> comparatorReversed = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // аналог reversed
            }
        };
        queue = new PriorityQueue<>(comparatorReversed);
        queue.add("Маша");
        queue.add("Петя");
        queue.add("Паша");
        queue.add("Миша");
        System.out.println("Добавление offer = "+queue.add("Гриша"));
        System.out.println(queue);

        System.out.println("Просмотр = "+queue.element());
        while (!queue.isEmpty()) {
            System.out.println("Извлечено = "+queue.remove());
        }


        PriorityQueue<Fly> flyQueue = new PriorityQueue<>();
        Fly fly1 = new Fly("Boeing", 1990, 900);
        Fly fly2 = new Fly("Ту-134", 1980, 600);
        Fly fly3 = new Fly("Airbus-300", 1990, 800);
        Fly fly4 = new Fly("Ил-200", 1989, 600);

        flyQueue.add(fly1);
        flyQueue.add(fly2);
        flyQueue.add(fly3);
        flyQueue.add(fly4);
        System.out.println(flyQueue);

        System.out.println("Тех обслуживание = " +  flyQueue.remove() );
        System.out.println(flyQueue);

        // меняем приоритеты
        Comparator<Fly> comparatorName = new SortFlyByName();
        flyQueue = new PriorityQueue<>(comparatorName);
        flyQueue.add(fly1);
        flyQueue.add(fly2);
        flyQueue.add(fly3);
        flyQueue.add(fly4);
        System.out.println(flyQueue);

        System.out.println("Тех обслуживание = " +  flyQueue.remove() );
        System.out.println(flyQueue);




    }
}
