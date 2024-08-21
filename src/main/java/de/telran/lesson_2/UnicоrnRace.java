package de.telran.lesson_2;

public class UnicоrnRace extends UnicornExt{
    int countPassengers;

    public UnicоrnRace(String name1, String color1, int weight1, int countHorn, int countPassengers) {
        super(name1, color1, weight1, countHorn);
        this.countPassengers = countPassengers;
    }

    public void transportPassangers() {
        System.out.println(name +" может перевозить "+countPassengers+" пассажиров");
    }

}
