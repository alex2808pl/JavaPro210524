package de.telran.lesson_2.polymorphism;

public class RockSinger extends Singer{
    public RockSinger(String name) {
        super(name);
    }

    @Override
    void sing() {
        System.out.println(name + " поет ROCK!!!");
    }
}
