package de.telran.module_2.lesson_6;

import java.util.*;

public class MainIterator {
    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>();
        listA.addAll(List.of(1,2,3,4,5,6,22,8,9));

        List<Integer> listL = new LinkedList<>();
        listL.addAll(List.of(1,2,3,4,5,6,22,8,9));

        // Перемещение по коллекции
        List<Integer> list4 = new ArrayList<>(); // заполнение
        for (int i = 0; i < 10; i++) {
            list4.add(i, i+5);
        }
        System.out.println(list4);
        // итерация по доступ к элементам по индексу
        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i)+" ");
        }
        System.out.println();

        // итерация элементов по Iterator

        // ArrayList
        Iterator<Integer> iterator = list4.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
//            iterator.remove();
            System.out.print(el + " ");
//            if(el == 11) el = 25; // редактирование данных - не работает
            if(el == 11) iterator.remove(); // удаление работает
        }
        System.out.println();
        System.out.println(list4);


        // LinkedList
        System.out.println(listL);
        iterator = listL.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
//            iterator.remove();
            System.out.print(el + " ");
            if(el == 22) iterator.remove(); // удаление работает
        }
        System.out.println();
        System.out.println(listL);


        // foreach - только для просмотра !!!
        System.out.println("foreach - ArrayList" );
        for(Integer el : listA) {
            System.out.print(el + " ");

        }
        System.out.println();


        int sum = 0;
        System.out.println("foreach - LinkedList" );
        for(Integer el : listL) {
            System.out.print(el + " ");
            sum += el;
        }
        System.out.println();
        System.out.println("Sum = "+sum);

        list4.forEach(System.out::print); // это будем учить после ламбда
        System.out.println();

        // --- ListIterator ----
        ListIterator<Integer> listIterator = listA.listIterator();
        // Как в iterator
        while (listIterator.hasNext()) {
            Integer el = listIterator.next();
            System.out.print(el + " ");
            if(el == 22) listIterator.remove(); // удаление работает
        }
        System.out.println();


        long start = System.currentTimeMillis();
        // Новый функционал
        while (listIterator.hasPrevious()) {
            Integer el = listIterator.previous();
            System.out.print(el + " ");
            if(el == 3) listIterator.remove(); // удаление работает

            if(el == 5) listIterator.set(555); // изменение работает

            if(el == 8) listIterator.add(888); // вставка работает
        }
        System.out.println();
        System.out.println(listA);

        long end = System.currentTimeMillis();
        System.out.println("Затраченное время = "+ (end-start));
    }

}
