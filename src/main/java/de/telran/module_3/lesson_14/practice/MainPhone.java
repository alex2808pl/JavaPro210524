package de.telran.module_3.lesson_14.practice;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.summingDouble;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("Nokia 3310",500,"Nokia");
        Phone phone1 = new Phone("Nokia 3030",560,"Nokia");
        Phone phone2 = new Phone("Nokia 3320",800,"Nokia");
        Phone phone3 = new Phone("Nokia 2334",200,"Nokia");
        Phone phone4 = new Phone("Nokia 3346",150,"Nokia");
        Phone phone5 = new Phone("Nokia 3317",1000,"Nokia");
        Phone phone6 = new Phone("Alcatel 34",450,"Alcatel");
        Phone phone7 = new Phone("Alcatel 345",234,"Alcatel");
        Phone phone8 = new Phone("Motorola89", 600,"Motorola");
        Phone phone9 = new Phone("Motorola899", 605,"Motorola");
        Phone phone10 = new Phone("Motorola599", 655,"Motorola");

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

        //count sum of all Phones, kotorie costs more then 600
        System.out.println(list.stream()
                .filter(x -> x.getPrice() > 600)
                .collect((summingDouble(Phone::getPrice))));

    }

}
