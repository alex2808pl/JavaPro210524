package de.telran.module_3.lesson_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainRefMethod {
    public static void main(String[] args) {
        // Function  ---- R apply(T t);

        //1. Лямбда
        Function<String, Integer> op = str -> Integer.parseInt(str);
        System.out.println((op.apply("256") + 3));

        //2. Ссылки на методы
        op = MainRefMethod::parse;
        System.out.println(op.apply("256"));

        // 3.Анонимный класс
        op = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s)+100;
            }
        };

        System.out.println(op.apply("256"));

        // 4. Именованный класс
        op = new ParseInt();
        System.out.println(op.apply("256"));


        List<Integer> list = new ArrayList<>(List.of(1,2,6,3,9,2));
        for (Integer el : list) {
            System.out.println(el);
        }

        System.out.println();
        // Consumer  --- void accept(T t);
        list.forEach(el -> System.out.println(el));

        // public void println(Object x)
        System.out.println("Ссылка на метод println");
        list.forEach(System.out::println);

        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;
        list.sort(comparator);
        System.out.println(list);

        comparator = Integer::compareTo;
        list.sort(comparator);
        System.out.println(list);

        comparator = new CompInt();
        list.sort(comparator);
        System.out.println(list);

        // каскад выполнения
        Function<Integer, String> opInt = (val) -> "Наше число -> "+Integer.toString(val);
        System.out.println(opInt.apply(12345));

        opInt = opInt.andThen(String::toUpperCase).andThen(String::toLowerCase);
        System.out.println(opInt.apply(12345));

    }

    static Integer parse (String str) {
         return Integer.parseInt(str)+10;
    }
}

class ParseInt implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s)+1000;
    }
}

class CompInt implements Comparator<Integer> {
   @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
