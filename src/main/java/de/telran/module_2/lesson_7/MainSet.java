package de.telran.module_2.lesson_7;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> setH = new HashSet<>(); // capacity = 16
        setH.add(6);
        setH.add(5);
        setH.add(8);
        setH.add(40); // согласно алгоритму тоже должен сохраниться по индексу = 8
        setH.add(24); // согласно алгоритму тоже должен сохраниться по индексу = 8
        setH.add(61);
        setH.add(55);
        setH.add(10);
        System.out.println("HashSet = "+setH);

        // Данные храняться в отсортированном виде
        Set<Integer> setT = new TreeSet<>(Set.of(6,5,8,40,24,61,55,10)); // создание с помощью набора литералов
        setT.add(1);
        System.out.println("TreeSet = "+setT);

        // Данные храняться в порядке добавления
        Set<Integer> setL = new LinkedHashSet<>();
        setL.add(6);
        setL.add(5);
        setL.add(8);
        setL.add(40); // согласно алгоритму тоже должен сохраниться по индексу = 8
        setL.add(24); // согласно алгоритму тоже должен сохраниться по индексу = 8
        setL.add(61);
        setL.add(55);
        setL.add(10);
        System.out.println("LinkedHashSet = "+setL);

        // добавление List и дубликатов
        setL.addAll(List.of(4,14,4)); // дубликаты добавлены не будут
        System.out.println("LinkedHashSet = "+setL);

        // --- добавление null

        setH.add(null); // в HashSet сохраняется в 0 индексе
        System.out.println("HashSet = "+setH);

        // setT.add(null); в TreeSet null добавлять нельзя!!!

        setL.add(null); // в HashSet сохраняется в порядке добавления
        System.out.println("LinkedHashSet = "+setL);

        // добавление дубликатов
        System.out.println(setH.add(8)); //не успешное добавление = false (дубликат)
        System.out.println(setH.add(11)); //успешное добавление = true
        System.out.println("HashSet = "+setH);

        // -- Set только для чтения
        Set<Integer> setUnmutable = Set.of(1,4,3,7,5,8); // не изменяемый Set
        // setUnmutable.add(10);  // нельзя добавлять
        // setUnmutable.remove(7); // нельзя удалять
        System.out.println("Поиск = "+setUnmutable.contains(7));
        System.out.println("Поиск = "+setUnmutable.contains(10));

        // Создаем неизменяемый Set из существующего
        Set<Integer> setTUnm = Collections.unmodifiableSet(setT); // Collections - библиотечный
        // setTUnm.add(22); // нельзя добавлять

        // Удаление
        System.out.println(setH.remove(55)); //успешно = true
        System.out.println(setH.remove(66)); //не успешно = false (такого элемента нет)
        System.out.println(setH.remove(null)); //успешно = true

        // удаляет все элементы, которых присутствуют в переданной коллекции
        System.out.println(setH.removeAll(Set.of(40,11,25))); //успешно = true
        System.out.println(setH.removeAll(Set.of(66,88,25))); //не успешно = false (ни одного элемента нет в списке)
        System.out.println("HashSet = "+setH);

        // удаляет все элементы, которых нет в переданной коллекции
        System.out.println(setH.retainAll(Set.of(5,8,25))); //успешно = true
        System.out.println("HashSet = "+setH);

        setH.clear(); //очистить всю коллекцию
        System.out.println("HashSet = "+setH);






    }
}
