package de.telran.lesson_2.interface1;

import de.telran.lesson_2.Horse;

public class Eagle extends Bird {
    boolean isPredator;

    @Override
    public void fly() {
        System.out.println(name + " летает как орел");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " - кричит как орел");
    }
}
