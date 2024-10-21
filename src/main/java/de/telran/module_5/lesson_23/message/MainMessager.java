package de.telran.module_5.lesson_23.message;

public class MainMessager {
    public static void main(String[] args) {
        System.out.println("== Главный поток стартовал");
        Message msg = new Message("обработать");

        // создаем подписчика
        Subscriber subscriber1 = new Subscriber(msg);
        new Thread(subscriber1, "subscriber1").start();
        Subscriber subscriber2 = new Subscriber(msg);
        new Thread(subscriber2, "subscriber2").start();
        Subscriber subscriber3 = new Subscriber(msg);
        new Thread(subscriber3, "subscriber3").start();

        // создаем издателя
        Publisher publisher = new Publisher(msg);
        new Thread(publisher, "publisher").start();

        System.out.println("Все потоки стартовали!");

        System.out.println("== Главный поток закончил работы");
    }
}
