package de.telran.module_4.lesson_15.practice;
// пользователь вводит строку. Мы ее проверяем, что она подходит под критерии email (наличие '@' и '.')

import java.util.Scanner;

public class MainEmail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean res = false;
        do {
            System.out.println("Введите email: ");
            String str = scanner.next();

            try {
                res = verify(str);
            } catch (UserException userException) {
                System.out.println(userException.getMessage());
            }
        } while (!res)
                ;

        Scanner scanner1 = new Scanner(System.in);
        res = false;

        do {
            System.out.println("Введите ФИО: ");
            String strFio = scanner1.nextLine();

            try {
                res = verifyFio(strFio);
            } catch (UserException userException) {
                System.out.println(userException.getMessage());
            }
        } while (!res)
                ;
    }

    static boolean verify(String str) {
        if (!str.contains("@")) throw new UserException("Отсутствует знак @ ", 1001);
        if (!str.contains(".")) throw new UserException("Отсутствует знак . ", 1002);
        return true;
    }

    static boolean verifyFio(String str) {
        int lengthFio = str.split(" ").length;
        if (lengthFio != 3) throw new UserException("НЕ верно указано ФИО ", 1003);
        return true;
    }
}
