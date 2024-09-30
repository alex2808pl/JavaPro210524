package de.telran.module_3.lesson_14.practice;

import java.util.ArrayList;
import java.util.List;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("Nokia 3310", 500, "Nokia");
        Phone phone1 = new Phone("Nokia 3311", 600, "Nokia");
        Phone phone2 = new Phone("Nokia 3320", 700, "Nokia");
        Phone phone3 = new Phone("Nokia 3110", 800, "Nokia");
        Phone phone4 = new Phone("Nokia 3133", 550, "Nokia");

        Phone phone5 = new Phone("Alcatel 34", 400, "Alcatel");
        Phone phone6 = new Phone("Alcatel 35", 450, "Alcatel");
        Phone phone7 = new Phone("Alcatel 36", 470, "Alcatel");

        Phone phone8 = new Phone("Motorola 37", 750, "Motorola");
        Phone phone9 = new Phone("Motorola 38", 850, "Motorola");
        Phone phone10 = new Phone("Motorola 39", 950, "Motorola");

        List<Phone> list = new ArrayList<>();
        list.add(phone);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.add(phone4);
        list.add(phone5);
        list.add(phone6);
        list.add(phone7);
        list.add(phone8);
        list.add(phone9);
        list.add(phone10);

        System.out.println(list);

        // Пороговая цена
        int thresholdPrice = 600;

        // Найдем сумму цен телефонов с ценой > thresholdPrice с использованием Stream API
        int sum = list.stream()
            .filter(x -> x.getPrice() > thresholdPrice)
            .mapToInt(x -> x.getPrice())
            .sum();
        System.out.println(sum);
    }
}
