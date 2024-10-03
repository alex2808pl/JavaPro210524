package de.telran.module_4.lesson_15.homework_031024;

import java.util.Scanner;

public class MainLoginPassword {
    public static void main(String[] args) {

        boolean res = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите login: ");
            String login = scanner.nextLine();
            System.out.println("Введите password: ");
            String password = scanner.nextLine();
            System.out.println("Введите confirmPassword: ");
            String confirmPassword = scanner.nextLine();
            try {
                res = verify(login, password, confirmPassword);
            } catch (WrongLoginException wrongLoginException) {
                System.out.println(wrongLoginException.getMessage());
            } catch (WrongPasswordException wrongPasswordException) {
                System.out.println(wrongPasswordException.getMessage());
            }

        } while (!res);

    }

    public static boolean verify(String login, String password, String confirmPassword) {
        if (login.length() >= 20) throw new WrongLoginException("Длина login должна быть меньше 20 символов!", 1001);

        char ch = login.charAt(0);
        if (Character.isDigit(ch) || !Character.isAlphabetic(ch) || (Character.isAlphabetic(ch) && Character.UnicodeBlock.of(ch) != Character.UnicodeBlock.BASIC_LATIN))
            throw new WrongLoginException("login должен начинаться с латинской буквы! ", 1002);

        // System.out.println(login.matches("\\w+"));
        char[] charArray = login.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            ch = charArray[i];

            if (Character.isDigit(ch))
                continue;

            if (Character.isAlphabetic(ch) && Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.BASIC_LATIN)
                continue;

            if (ch == '_') continue;
            //   throw new WrongLoginException("login должен содержать только латинские буквы, цифры и знак подчеркивания! ", 1003);
            throw new WrongLoginException();
        }
        //-----------------------------------
        if (password.length() >= 20)
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов!", 1004);

        charArray = password.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            ch = charArray[i];

            if (Character.isDigit(ch))
                continue;

            if (Character.isAlphabetic(ch) && Character.UnicodeBlock.of(ch) == Character.UnicodeBlock.BASIC_LATIN)
                continue;
            throw new WrongPasswordException("password должен содержать только латинские буквы, цифры!", 1006);

        }

        if (!password.equals(confirmPassword)) throw new WrongPasswordException();
        return true;
    }
}

