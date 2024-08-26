package de.telran.lesson_2.interface1.inter;

public class Plane implements Flyable, Soundable{
    String name;
    int countPassengers;

    void service() {
        System.out.println(name + " перед взлетом должен быть обслужен");
    }

    @Override
    public void fly() {
        System.out.println(name + " летает как самолет");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " шумит с помощью двигателей");
    }
}
