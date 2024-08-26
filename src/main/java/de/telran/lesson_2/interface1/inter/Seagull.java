package de.telran.lesson_2.interface1.inter;

public class Seagull implements AllActivities{
    @Override
    public void eat() {
        System.out.println("Чайка ест рыбу");
    }

    @Override
    public void fly() {
        System.out.println("Чайка летает с помощью рыбу");
    }

    @Override
    public void makeSound() {
        System.out.println("Чайка громко кричит");
    }

    @Override
    public void swim() {
        System.out.println("Чайка плавает используя лапы");
    }


}
