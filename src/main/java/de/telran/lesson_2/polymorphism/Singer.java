package de.telran.lesson_2.polymorphism;

public abstract class Singer {
    String name;

    public Singer(String name) {
        this.name = name;
    }

    abstract void sing();
}
