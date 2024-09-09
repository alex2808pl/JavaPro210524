package de.telran.module_2.lesson_6;

import java.util.*;

public class MainList {
    public static void main(String[] args) {

        List listO = new ArrayList<>(); // raw types - не рекомендуется использовать
        System.out.println(listO);

        List<Integer> listA = new ArrayList<>();
        System.out.println(listA);

        List<Integer> listL = new LinkedList<>();
        System.out.println(listL);


        // --- Добавление данных

        listO.add("Вася");
        listO.add(123);
        listO.add(123.01);
        System.out.println(listO);

        listA.add(1); // добавляет в конец
        listA.add(2);
        listA.add(4);
        System.out.println(listA);

        listA.add(1,22); // вставка
        System.out.println(listA);

        listA.addLast(1); // операция аналогична аdd(...), вставляет в конец
        System.out.println(listA);

        listA.addFirst(4); // добавление в начало
        System.out.println(listA);

        listA.addAll(List.of(7,8,9)); // добавление списка
        System.out.println(listA);

        listA.addAll(2, List.of(7,8,9));  // вставка списка
        System.out.println(listA);


        // Работа с LinkedList

        System.out.println( "---- Работа с LinkedList ----");
        listL.add(1); // добавляет в конец
        listL.add(2);
        listL.add(4);
        System.out.println(listL);

        listL.add(1,22); // вставка
        System.out.println(listL);

        listL.addLast(1); // операция аналогична аdd(...), вставляет в конец
        System.out.println(listL);

        listL.addFirst(4); // добавление в начало
        System.out.println(listL);

        listL.addAll(List.of(7,8,9)); // добавление списка
        System.out.println(listL);

        listL.addAll(2, List.of(7,8,9));  // вставка списка
        System.out.println(listL);


        // === Изменение информации
        System.out.println(" === Изменение информации === ");
        listA.set(1, 111);
        System.out.println(listA);

        System.out.println(" === Удаление информации === ");
        listA.remove(1); // удаление по индексу
        System.out.println("Удаление существующего значения 22 = "+listA.remove((Integer) 22)); //удаление по значению элемента
        System.out.println("Удаление не существующего значения 44 = "+listA.remove((Integer) 44)); //удаление по значению элемента
        System.out.println(listA);

        List<String> listStr = new ArrayList<>();
        listStr.addAll(List.of("Один", "Два", "Три"));
        System.out.println(listStr);
        System.out.println(listStr.remove("Два")); //удаление по значению элемента
        System.out.println(listStr);

        listA.removeFirst(); //удаление первого
        listA.removeLast();  // удаление последнего
        System.out.println(listA);

        System.out.println(listA.removeAll(List.of(2, 4, 1, 11))); // удаление любого элемента из списка по значению
        System.out.println(listA); // если хотя бы один элемент был удален = true

        System.out.println(listA.removeAll(List.of(2, 3, 4)));
        System.out.println(listA);  // если не найдены в массиве все элементы и ничего не было удалено = false

        // Поиск информации
        System.out.println(listA.get(2)); // возврат значения по индексу
        System.out.println(listA.getFirst()); // возврат значения первого элемента
        System.out.println(listA.getLast()); // возврат значения последнего элемента

        System.out.println(listA.contains(9));
        if(listA.contains(7))
            System.out.println("Объект найден");
        else
            System.out.println("Объект не найден");



        // ---- Заполнение массива данными
        List<Integer> list1 = List.of(1,2,3,4,5,6); // не изменяемый массив
        // Операции изменения данных проводить нелзя!!!
        // list1.add(11);
        // list1.remove(4);
        //list1.set(3,11);

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6); // не изменяемый массив
        //list2.add(11);
        // list2.remove(4);
        //list2.set(3,11);

        // Сделать изменяемыми
        List<Integer> list3 = new LinkedList<>(); //new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6));
        list3.add(11);
        list3.remove(4);
        list3.set(3,11);
        System.out.println(list3);

        list3.clear(); //очистить список



    }
}
