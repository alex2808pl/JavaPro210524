package de.telran.lesson_2.interface1.inter;

public interface SwimDivingable { // extends Soundable, Flyable // наследовать интерфейс разрешено
    void swim();
    // есть реализация по умолчания
    default void diving() { //после Java8 включительно
        System.out.println("ныряет под воду");
    };
}
