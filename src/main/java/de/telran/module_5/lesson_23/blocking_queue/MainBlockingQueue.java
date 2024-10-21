package de.telran.module_5.lesson_23.blocking_queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class MainBlockingQueue {
    public static void main(String[] args) {
//        System.out.println(" ==== SynchronousQueue =========");
//        BlockingQueue<Integer> products = new SynchronousQueue<>();
//        (new Thread(new Producer(products))).start();
//        (new Thread(new Consumer(products))).start();

        System.out.println(" ==== ArrayBlockingQueue =========");

        // Больше 3х не будет, fair - гарантируется очередность потоков
        BlockingQueue<Integer> products2 = new ArrayBlockingQueue<>(3, true);
        (new Thread(new Producer(products2))).start();
        (new Thread(new Consumer(products2))).start();
    }
}
