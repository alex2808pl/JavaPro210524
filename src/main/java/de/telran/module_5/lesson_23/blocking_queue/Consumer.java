package de.telran.module_5.lesson_23.blocking_queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> products;

    public Consumer(BlockingQueue<Integer> products) {
        this.products = products;
    }


    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                Thread.sleep(500);
                System.out.println("Унесли ящик номер = "+products.take());
                System.out.println("На складе = "+products.stream().count());
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
