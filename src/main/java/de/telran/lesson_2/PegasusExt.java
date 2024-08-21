package de.telran.lesson_2;

public class PegasusExt extends Horse { //наследования
    int countWings;

    public PegasusExt(String name1, String color1, int weight1, int countWings) {
        super(name1, color1, weight1);
        this.countWings = countWings;
    }

    public void fly(){
        System.out.println("Летит "+name+" цвет "+color+" с грузом весом "+weight);
    }
}
