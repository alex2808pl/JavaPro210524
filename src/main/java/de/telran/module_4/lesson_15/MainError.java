package de.telran.module_4.lesson_15;

public class MainError {
    public static void main(String[] args) {
        // обрабатываем ошибки через возвращаемое значение из метода
        int res = div(4, 0);
        if(res==Integer.MIN_VALUE)
            System.out.println("2й параметр не корректен");
        else if (res==Integer.MIN_VALUE-1)
            System.out.println("1й параметр должен быть положительный");
        else
            System.out.println("res="+res);

        // обрабатываем ошибки через выбрасываемое исключение
        try {
            res = divExc(4, 1);
            res = divExc(-4, 2);
        } catch (ArithmeticException ex) { //системное исключение
            System.out.println("2й параметр не корректен (Exception)");
            //System.out.println(ex.toString());
            //ex.printStackTrace();
        } catch (RuntimeException ex) {
            System.out.println("1й параметр должен быть положительный (Exception)");
        }


        System.out.println("=== Программа завершается корректно === ");
    }

    // объявляем об ошибке через возвращаемое значение из метода
    public static int div(int v1, int v2) {
        if(v2==0) return Integer.MIN_VALUE; // второй параметр == 0
        if(v1<=0) return Integer.MIN_VALUE-1; // первый параметр не положительный
        int res = v1 / v2;
        return res;
    }

    // объявляем об ошибке через выбрасываемое исключение
    public static int divExc(int v1, int v2) {
        if(v1<=0) throw new RuntimeException("первый параметр не положительный"); // первый параметр не положительный
        int res = v1 / v2;
        return res;
    }


}
