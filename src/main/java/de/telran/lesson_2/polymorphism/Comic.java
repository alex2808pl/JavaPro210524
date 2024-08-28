package de.telran.lesson_2.polymorphism;

import javax.xml.namespace.QName;

public class Comic implements Playable{
    String name;

    public Comic(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " играет на нервах");
    }

    @Override
    public void speak() {
        System.out.println(name + " рассказывает веселые истории");
    }
}
