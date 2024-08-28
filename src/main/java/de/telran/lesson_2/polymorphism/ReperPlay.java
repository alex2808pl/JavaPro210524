package de.telran.lesson_2.polymorphism;

public class ReperPlay implements Playable{
    String name;

    public ReperPlay(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на инструменте");
    }

    @Override
    public void speak() {
        System.out.println(name + " красиво говорит РЭП");
    }

    public void dance() {
        System.out.println(name + " умеет танцевать под  РЭП");
    }
}
