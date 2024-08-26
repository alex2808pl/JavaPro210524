package de.telran.lesson_2.interface1.inter;

public class Duck implements Flyable, Soundable, SwimDivingable{

    @Override
    public void fly() {
        System.out.println(" летает как утка");
    }

    @Override
    public void makeSound() {
        System.out.println(" крякает");
    }

    @Override
    public void swim() {
        System.out.println(" плавает с помощью перепонок на ногах ");
    }
 }
