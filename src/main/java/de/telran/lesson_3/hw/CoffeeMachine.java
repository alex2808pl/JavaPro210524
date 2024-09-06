package de.telran.lesson_3.hw;

public class CoffeeMachine {
    private CoffeeMachine() {
    }

    public static final CoffeeMachine INSTANCE = new CoffeeMachine();

    public void cappuccino() {
        System.out.println("Ваш капуччино готов");
    }
    public void espresso() {
        System.out.println("Ваш эспрессо готов");
    }

    public void latte() {
        System.out.println("Ваш латте готов");
    }

}
