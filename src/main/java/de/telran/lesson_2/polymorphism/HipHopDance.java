package de.telran.lesson_2.polymorphism;

public class HipHopDance extends Dance{
    public HipHopDance(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(name + " круто танцует HipHop");
    }
}
