package de.telran.lesson_2.in;

import de.telran.lesson_2.Horse;

// public class Pony extends de.telran.lesson_2.Horse //полное наименование класса
public class Pony extends Horse { //Horse краткое наименование класса (нужно использовать import)
    int height; //рост

    public Pony() {
    }

    public Pony(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public void transportsChildren() {
        System.out.println(name + " цвет "+super.color+" катает детей");
    }
}
