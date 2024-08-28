package de.telran.lesson_2.polymorphism;

public class MainStatPolym { //перегрузка метода
    static int add(int v1, int v2) {
        System.out.println("Выполняется int add(int v1, int v2");
        return v1 + v2;
    }

    //нельзя использовать, потому что анализируются только типы аргументов, а не имя переменных
//    static int add(int v2, int v1) {
//        System.out.println("Выполняется int add(int v1, int v2");
//        return v1 + v2;
//    }

    // нельзя использовать компилятор воспринимает этот метод как дубликат
//    static double add(int v1, int v2) {
//        System.out.println("Выполняется int add(int v1, int v2");
//        return (double)v1 + v2;
//    }

    static double add(double v1, double v2) {
        System.out.println("Выполняется double add(double v1, double v2)");
        return v1 + v2;
    }

    static double add(int v1, double v2) {
        System.out.println("Выполняется double add(int v1, double v2)");
        return v1 + v2;
    }

    static double add(double v1, int v2) { // отличиается порядок следование аргументов
        System.out.println("Выполняется double add(double v1, int v2)");
        return v1 + v2;
    }



    public static void main(String[] args) {
        System.out.println(add(5,8));
        System.out.println(add(1.0, 3.5));
        System.out.println(add(1, 3.5));

        System.out.println(add(1L, 3.5));
        System.out.println(add(3.5, 1));


    }


}
