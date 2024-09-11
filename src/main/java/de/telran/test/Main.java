package de.telran.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Ввод названия месяца
        System.out.print("Введите название месяца на русском: ");
        String monthName = scanner.nextLine();

        // Закрываем Scanner
        scanner.close();

        // Получаем месяц по русскому названию
        Month currentMonth = Month.getByRussianName(monthName);

        // Вывод результата, если месяц корректно определен
        if (currentMonth != null) {
            System.out.println("Месяц: " + currentMonth.getRussianName());
            System.out.println(currentMonth.recommendDiet());
        } else {
            System.out.println("Месяц не найден. Проверьте ввод.");
        }
    }
}
