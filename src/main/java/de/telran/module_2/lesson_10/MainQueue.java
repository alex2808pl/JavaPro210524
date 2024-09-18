package de.telran.module_2.lesson_10;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(); //FIFO

        // Извлечение данных при пустой очереди
        System.out.println("Извлеченние poll = "+queue.poll()); //класика Queue (вернет null)
        System.out.println("Просмотр = "+queue.peek()); //класика Queue (вернет null)
        System.out.println(queue);

        // System.out.println("Извлеченние remove = "+queue.remove()); // ( вернет Exception)
        // System.out.println("Просмотр = "+queue.element()); // ( вернет Exception)

        // Добавление класика Queue
        queue.offer("Маша");
        queue.offer("Петя");
        queue.offer("Паша");
        queue.offer("Миша");
        System.out.println("Добавление offer = "+queue.offer("Гриша"));
        System.out.println(queue);

        System.out.println("Добавление add = "+queue.add("Дима")); // добавление как в List
        System.out.println(queue);

        // Извлечение данных
        System.out.println("Извлеченние poll = "+queue.poll()); //класика Queue
        System.out.println(queue);

        System.out.println("Извлеченние remove = "+queue.remove());
        System.out.println(queue);

        // Просмотр

        System.out.println("Просмотр = "+queue.peek());
        System.out.println(queue);

        System.out.println("Просмотр = "+queue.element());
        System.out.println(queue);

        // Рекомендуется использовать один из подходов:
        // offer / poll / peek  - проверка ошибок по возвращаемому значению из метода
        // add / remove / element - возвращает Exception

    }
}
