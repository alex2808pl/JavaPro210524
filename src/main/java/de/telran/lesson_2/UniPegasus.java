package de.telran.lesson_2;

public class UniPegasus extends PegasusExt {
    UnicornExt unicorn; //ассоциация

    public UniPegasus(String name1, String color1, int weight1, int countWings, int countHorn) {
        super(name1, color1, weight1, countWings);
        unicorn = new UnicornExt(name1, color1, weight1, countHorn);
    }

    // is(является) - PegasusExt, has(включает) - UnicornExt

}
