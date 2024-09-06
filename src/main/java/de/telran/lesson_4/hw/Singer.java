package de.telran.lesson_4.hw;

public class Singer extends Artist{
    public Singer(String name) {
        super(name);
    }

    @Override
    public void showTalent() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " sings very well");
    }
}