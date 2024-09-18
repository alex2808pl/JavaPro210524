package de.telran.module_2.lesson_10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class MainArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // как Stack
        deque.push("Маша"); // возвращает при ошибке Exception
        deque.push("Петя");
        deque.push("Паша");
        deque.push("Миша");
        deque.push("Гриша"); // последний добавлен, первый на извлечение
        System.out.println(deque);

        System.out.println("Просмотр = "+deque.peek());
        System.out.println("Извлечение = "+deque.pop());
        System.out.println(deque);

        //Любое извлечение работает по приципу Stack, потому что мы добавляли данных как в Stack
        System.out.println("Извлечение как Queue = "+deque.poll());
        System.out.println(deque);
        System.out.println("Извлечение как List = "+deque.remove());
        System.out.println(deque);

        deque.clear();

        // как Queue FIF0
        deque.offer("Маша"); // возвращает при ошибке Exception
        deque.offer("Петя");
        deque.offer("Паша");
        deque.offer("Миша");
        deque.offer("Гриша"); // последний добавлен, последний на извлечение
        System.out.println(deque);

        System.out.println("Извлечение как Queue = "+deque.poll());
        System.out.println(deque);

        //Любое извлечение работает по приципу Queue, потому что мы добавляли данных как в Queue
        System.out.println("Извлечение как Stack = "+deque.pop());
        System.out.println(deque);
        System.out.println("Извлечение как List = "+deque.remove());
        System.out.println(deque);

        deque.clear();

        // Иммитируем Stack LIFO
        deque.addFirst("Маша"); // возвращает при ошибке Exception
        deque.addFirst("Петя");
        deque.addFirst("Паша");
        deque.addFirst("Миша");
        deque.addFirst("Гриша"); // последний добавлен, первый на извлечение
        System.out.println(deque);

        System.out.println("Извлечение имитируем как  Stack = "+deque.removeFirst());
        System.out.println(deque);

        System.out.println("Извлечение имитируем как Queue = "+deque.removeLast());
        System.out.println(deque);

        System.out.println("Извлечение как List = "+deque.remove("Паша"));
        System.out.println(deque);

        System.out.println("Извлечение как List = "+deque.remove());  //удалем первый элемент
        System.out.println(deque);

    }
}
