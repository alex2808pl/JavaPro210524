package de.telran.module_3.lesson_14;

import java.util.List;

public class MainReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,9,-3,6,4);

        // Optional<T> reduce(BinaryOperator<T> accumulator)
        System.out.println("Без identity = "+list.stream()
                .reduce((a, b) -> a * b)
                .orElse(0));
        // v1 op v2 op v3 ... op vN


        // T reduce(T identity, BinaryOperator<T> accumulator)
        int identity = 1;
        System.out.println("Метод с identity = "+list.stream()
                .reduce(identity, (a, b) -> a * b));
        // identity op v1 op v2 op v3 ... op vN


        //U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
    }
}
