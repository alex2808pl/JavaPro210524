package de.telran.module_5.lesson_23.blocking_queue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private BlockingQueue<Integer> products;

    public Producer(BlockingQueue<Integer> products) {
        this.products = products;
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println("Положили ящик номер = "+i);
                products.put(i);
                System.out.println("На складе = "+products.stream().count());
             //   Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
