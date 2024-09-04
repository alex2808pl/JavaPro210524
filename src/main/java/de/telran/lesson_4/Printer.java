package de.telran.lesson_4;

import javax.swing.*;

public class Printer {
    public <T> void print(T[] arr) { //
        System.out.println(" Я печатаю T[] :" );
        for (T val : arr)
            System.out.print(val+" ");
        System.out.println();
    }

    public void print(int[] arr) {
        System.out.println(" Я печатаю int[] :" );
        for (Integer val : arr)
            System.out.print(val+" ");
        System.out.println();
    }
}
