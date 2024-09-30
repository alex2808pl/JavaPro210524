package de.telran.module_3.lesson_14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainFlatMap {
    public static void main(String[] args) {
        List<Integer> list = List.of(9, 8, 1, 2, 3, 4, 5, 6);
        list.stream()
                .flatMap(x -> {
                    if(x % 2 == 0) {
                        return Stream.of(x,-x, x*10);
                    }
                    else return Stream.empty();
                })
                .forEach(x -> System.out.print(x+" ,"));
        System.out.println();


        // аналог flatMap - mapMulti
        list.stream()
                .mapMulti((x, consumer) -> {
                    if (x % 2 == 0) {
                        consumer.accept(-x);
                        consumer.accept(x);
                        consumer.accept(x*10);
                    }
                })
                .forEach(x -> System.out.print(x+" ,"));
        System.out.println();


        // flatMap - работа с многомерными массивами
        String[][] arrStr = {   {"a", "b", "c"},
                                {"d", "e", "f"},
                                {"g", "o", "y"}};

        // получение стрима всех значений объектов
        List<String> lists = Arrays.stream(arrStr)
                .flatMap(x->Arrays.stream(x)) // лямбда
                .collect(Collectors.toList());
        System.out.println(lists);

        // аналог
        lists = Arrays.stream(arrStr)
                .flatMap(Arrays::stream) //ссылка на метод
                .collect(Collectors.toList());
        System.out.println(lists);

        //убрать ряд, где есть элемент "d"
        lists = Arrays.stream(arrStr)
                .filter(x ->
                        Arrays.stream(x)
                                .filter(el -> el.contains("d"))
                                .count() == 0
                 )
                .flatMap(Arrays::stream) //ссылка на метод
                .collect(Collectors.toList());
        System.out.println(lists);

        // аналог
        lists = Arrays.stream(arrStr)
                .filter(x ->
                        !Arrays.stream(x)
                                .anyMatch(el -> el.contains("d"))
                )
                .flatMap(Arrays::stream) //ссылка на метод
                .collect(Collectors.toList());
        System.out.println(lists);

    }


}
