package de.telran.module_4.lesson_17;

import java.io.*;
import java.util.Scanner;

public class MainSystemIO {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.println("Scanner = "+num);
       // System.err.println("\nПример нашей ошибки");

        // InputStream
        InputStream inputStream = System.in; // байтовый поток
        Reader reader = new InputStreamReader(inputStream); // преобразование в символьный поток
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str = null;
        System.out.print("Введите число: ");
        try {
            str = bufferedReader.readLine();
            num = Integer.parseInt(str);
        } catch (NumberFormatException | IOException e) {
            System.err.println("Ошибка ввода информации");
            throw new RuntimeException(e);
        }
        System.out.println("InputStream = "+num);

    }
}
