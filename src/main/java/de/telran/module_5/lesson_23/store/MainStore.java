package de.telran.module_5.lesson_23.store;

public class MainStore {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer1 = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer1).start();
    }
}
