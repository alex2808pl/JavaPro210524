package de.telran.module_2.lesson_10;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //LIFO
        stack.push(9);
        stack.push(1);
        stack.push(3);
        stack.push(8);
        stack.push(4);
        System.out.println(stack.push(3)); //возвращает добавляемое значение в случае успеха
        System.out.println(stack);

        System.out.println("Output stack = "+stack.pop()); //извлечение
        System.out.println(stack);

        System.out.println("Peek stack = "+stack.peek()); // просмотр
        System.out.println(stack);

        System.out.println("Empty? - "+stack.empty()); // проверка на заполненость

        System.out.println("Search = "+stack.search(3)); // возвращает значение объекта, если найден
        System.out.println("Search = "+stack.search(10)); // -1 объект не найден


    }
}
