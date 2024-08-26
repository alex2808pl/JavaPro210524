package de.telran.lesson_2.interface1;

public class MainBird {
    public static void main(String[] args) {
        // Bird bird = new Bird(); //объект абстрактного класса создать невозможно

        Eagle eagle = new Eagle();
        eagle.name = "Сокол";
        eagle.eat();
        eagle.fly();
        eagle.makeSound();

        Voron voron = new Voron();
        voron.name = "Каркуша";
        voron.eat();
        voron.fly();
        voron.makeSound();

    }
}
