package de.telran.lesson_2.polymorphism;

public class Dance {
    String name;
    int age;

    public Dance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(name+ " - просто танцует");
    }
}
