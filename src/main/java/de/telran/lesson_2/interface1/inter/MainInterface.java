package de.telran.lesson_2.interface1.inter;

public class MainInterface {
    public static void main(String[] args) {
        Mosquito mosquito = new Mosquito("Малярийный комар", true);
        mosquito.fly();
        mosquito.makeSound();

        // Flyable flyable = new Flyable(); объект интерфейса я создать не могу

        Plane plane = new Plane();
        plane.name = "Airbus";
        plane.service();
        plane.fly();
        plane.makeSound();

        System.out.println();

        Duck duck = new Duck();
        duck.fly();
        duck.makeSound();
        duck.swim();
        duck.diving();

        System.out.println();
        Submarine submarine = new Submarine();
        submarine.makeSound();
        submarine.swim();
        submarine.diving();

        System.out.println();
        Seagull seagull = new Seagull();
        seagull.eat();
        seagull.fly();
        seagull.makeSound();
        seagull.swim();
        seagull.diving();
    }
}
