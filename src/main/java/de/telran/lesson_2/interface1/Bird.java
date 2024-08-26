package de.telran.lesson_2.interface1;

import de.telran.lesson_2.interface1.inter.Flyable;

public abstract class Bird implements Flyable { //имплементация интерфейса возможна в абстрактный класс
    String name;
    String color;

    public void eat() {
        System.out.println(name+" кушает через клюв");
    }

    public abstract void fly();

    public abstract void makeSound();

}
