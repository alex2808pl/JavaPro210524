package de.telran.lesson_2;

public class UnicornExt extends Horse{
    int countHorn;

    public UnicornExt(String name1, String color1, int weight1, int countHorn) {
        super(name1, color1, weight1);
        this.countHorn = countHorn;
    }

    public void butt() { //умение драться
        System.out.println(name+ " при защите бодается "+countHorn+" рогом/ами");
    }
}
