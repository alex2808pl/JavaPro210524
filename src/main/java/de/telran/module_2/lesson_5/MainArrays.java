package de.telran.module_2.lesson_5;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
        // инициализация по умолчанию
        int[] arr;
        arr = new int[5];
        System.out.println(Arrays.toString(arr));

        // инициализация руками
        int[] arr1  = new int[5];
        for (int i = 0; i<arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println(Arrays.toString(arr1));

        // инициализация c помощью литерала
        int[] arr2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(arr2));

        //поиск информации

        // по индексу
        System.out.println(arr2[2]);

        for (int i = 0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println();
        //foreach
        for (int el : arr1) {
            System.out.println(el);
        }

        // изменение данных
        System.out.println(Arrays.toString(arr1));
        arr1[3] = 8;
        System.out.println(Arrays.toString(arr1));


        // массив разных типов  (не рекомендуется)
        Object[] obj = new Object[3];
        obj[0] = 1;
        obj[1] = "My str";
        obj[2] = true;
        System.out.println(Arrays.toString(obj));


        // --------- Многомерные массивы ------
        int[][] arr2m = new int [2][3];
        System.out.println(Arrays.toString(arr2m));
        System.out.println(Arrays.deepToString(arr2m));

        int[][] arr2m1 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr2m1));

        for (int i = 0; i < arr2m.length; i++) {
            for (int j = 0; j < arr2m[i].length; j++) {
                arr2m[i][j] = i * j + 1;
            }
        }
        System.out.println(Arrays.deepToString(arr2m));

        // 3 мерный массив
        int[][][] arr3m = {{{1,2},{3,4}},{{11,22},{33,44}}, {{111,222},{333,444}}}; //int[2][2][2]
        System.out.println(Arrays.deepToString(arr3m));

    }

}
