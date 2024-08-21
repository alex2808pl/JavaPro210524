package de.telran.lesson_2;

public class Pegasus { //дублирование кода
    String name;
    String color;
    int weight; // количество груза
    int countWings;

    public Pegasus(String name, String color, int weight, int countWings) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.countWings = countWings;
    }

    public void run() {
        System.out.println("Бежит "+name+" цвет "+color);
    }

    public void transports() {
        System.out.println("Лошадь "+name+" везет груз весом "+weight);
    }

    public void fly(){
        System.out.println("Летит "+name+" цвет "+color+" с грузом весом "+weight);
    }

}
