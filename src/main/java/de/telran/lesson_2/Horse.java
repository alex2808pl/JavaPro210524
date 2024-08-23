package de.telran.lesson_2;

public class Horse {
    public String name;
    protected String color; //доступен потомкам
    int weight; // количество груза
    private int countTooths; // не наследуется потомками

    public Horse() {
    }

    public Horse(String name1, String color1, int weight1) {
        name = name1;
        color = color1;
        weight = weight1;
    }

    public Horse(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public void run() {
        System.out.println("Бежит как лошадь "+name+" цвет "+color+" зубы "+countTooths);
    }

    public void transports() {
        System.out.println(name+" везет груз весом "+weight+" как лошадь по земле");
    }

    // не наследуется потомками
    private void addTooth(int count) {
        System.out.println(name+" имел "+countTooths+" зубов");
        countTooths += count;
        System.out.println(name+" после вставки уже имеет "+countTooths+" зубов");
    }


}
