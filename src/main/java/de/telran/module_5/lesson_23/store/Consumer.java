package de.telran.module_5.lesson_23.store;

public class Consumer implements Runnable{

    private Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 10; i++) {
            store.get(); // забирать товар
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}