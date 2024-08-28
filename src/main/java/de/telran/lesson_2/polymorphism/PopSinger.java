package de.telran.lesson_2.polymorphism;

public class PopSinger extends Singer{
    public PopSinger(String name) {
        super(name);
    }

    @Override
    void sing() {
        System.out.println(name+" поет РОР!");
    }
}
