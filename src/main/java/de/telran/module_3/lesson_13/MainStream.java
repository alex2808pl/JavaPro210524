package de.telran.module_3.lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,3,7,4,9,3,5,4,2,7,5,8,3,1));
        for (Integer val : list) {
            if(val % 2 == 0) {
                System.out.print(val + ",");
            }
        }
        System.out.println();

        // Predicate  boolean test(T t) { return val % 2 == 0; }
        list.stream()
                .distinct()
                .filter((val)-> val % 2 == 0)
                .forEach((val) -> System.out.print(val + ","));
        System.out.println();

        List<Integer> result =
                list.stream()
                .distinct()
                .filter((val)-> val % 2 == 0)
                .toList();
        System.out.println(result);

        List<Integer> listStream =
                Stream.of(1, 2, 3, 7, 4, 3, 6) //самостоятельно создали
                .toList();
        System.out.println(listStream);

        Stream<Integer> streamList = list.stream();
        streamList
                .filter( x-> x > 5) // промежуточная
                .forEach(System.out::println); //терминальная операция
        // повторно Stream, над которым выполнена терминальная операция вызвать НЕЛЬЗЯ!!!
         //streamList.toList();

        streamList = list.stream(); //обязательно нужно Stream пересоздать!
        System.out.println(streamList.toList());


    }
}
