package de.telran.module_5.lesson_23.store;

public class Producer implements Runnable {
    private Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 10; i++) {
            store.put();
        }
    }
}
