package de.telran.lesson_2.polymorphism;

public class BreakDance extends Dance{
    public BreakDance(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(name+ " мочит break!!!");
    }
}
