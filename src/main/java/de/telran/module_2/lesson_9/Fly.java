package de.telran.module_2.lesson_9;

public class Fly implements Comparable<Fly> {
    private String name;
    private int year; // год выпуска
    private int speedMax; //макс скорость

    public Fly(String name, int year, int speedMax) {
        this.name = name;
        this.year = year;
        this.speedMax = speedMax;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fly fly = (Fly) o;
        return year == fly.year && speedMax == fly.speedMax && name.equals(fly.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + year;
        result = 31 * result + speedMax;
        return result;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", speedMax=" + speedMax +
                '}';
    }

    @Override
    public int compareTo(Fly o) {
        if(this.year > o.year) return 1;
        else if(this.year < o.year) return -1;
        else return 0;
    }
}
