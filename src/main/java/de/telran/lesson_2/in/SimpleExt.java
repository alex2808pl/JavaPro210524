package de.telran.lesson_2.in;

import de.telran.lesson_2.Horse;

public class SimpleExt {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.name = "Чужая лошадь";

        horse.run();
        horse.transports();
        System.out.println();

        Pony pony = new Pony();
        pony.name = "Пони мони";
        pony.height = 1;
        pony.run();
        pony.transports();
        pony.transportsChildren();

        System.out.println();

        Pony pony1 = new Pony("Пони Маруся", "радужный", 2);
        pony1.run();
        pony1.transports();
        pony1.transportsChildren();
    }
}
