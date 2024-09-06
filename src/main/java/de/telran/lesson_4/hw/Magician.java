package de.telran.lesson_4.hw;

public class Magician extends Artist{
    public Magician(String name) {
        super(name);
    }

    @Override
    public void showTalent() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is showing tricks");
    }
}