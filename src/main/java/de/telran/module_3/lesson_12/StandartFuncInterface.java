package de.telran.module_3.lesson_12;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.*;

public class StandartFuncInterface {
    public static void main(String[] args) {
        MyOperation myOperationSum = (x, y) -> x + y;
        System.out.println("myOperationSum = " + myOperationSum.operation(10, 2));

        BiFunction<Integer, Integer, Integer> function = (x, y) -> x + y;
        System.out.println("functionSum = " + function.apply(10,2));

        function = (x, y) -> x - y;
        System.out.println("functionSub = " + function.apply(10,2));

        function = (x, y) -> x * y;
        System.out.println("functionMult = " + function.apply(10,2));

        // == Predicate (boolean test(T t);)
        Predicate<Integer> predicate = (x) -> x > 0;
        System.out.println("Predicate x > 0 "+predicate.test(10));

        Predicate<String> predicateStr = (x) -> x.length() > 10;
        System.out.println("Predicate x.length() > 10 "+predicateStr.test("Мама мыла раму"));

        // == Consumer    void accept(T t);
        Consumer<Integer> consumer = (x) -> System.out.println("Наше число = "+x);
        consumer.accept(10);

        consumer = (t) -> {
          if(t > 20) System.out.println("На улице тепло");
          else if (t < 0) System.out.println("На улице холодно");
          else System.out.println("На улице прохладно");
        };

        consumer.accept(15);
        consumer.accept(22);
        consumer.accept(-2);

        // == Function    R apply(T t);
        Function<Integer, Double> function1 = (x) -> (double)x * x;
        System.out.println("Function = "+function1.apply(10));

        // == Supplier     T get();
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };

        System.out.println("Supplier = "+supplier.get());


        // == BiPredicate    boolean test(T t, U u);
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> x > y;
        System.out.println("BiPredicate = "+biPredicate.test(10, 7));


        // работа с  Comparator
        Comparator<Integer> comparatorLambda = ((o1, o2) -> o2 - o1);
        Set<Integer> set = new TreeSet<>(comparatorLambda);
        set.add(5);
        set.add(8);
        set.add(1);
        set.add(19);
        set.add(3);
        System.out.println(set);

        Set<Integer> set1 = new TreeSet<>((o1,o2) -> o1.compareTo(o2));
        set1.addAll(set);
        System.out.println(set1);


        Comparator<String> comparatorStrLambda = ((o1, o2) -> o2.compareTo(o1));
        Set<String> setStr = new TreeSet<>(comparatorStrLambda);
        setStr.add("Паша");
        setStr.add("Маша");
        setStr.add("Саша");
        setStr.add("Каша");
        setStr.add("Вася");
        System.out.println(setStr);
    }
}
