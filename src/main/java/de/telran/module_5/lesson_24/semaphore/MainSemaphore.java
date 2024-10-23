package de.telran.module_5.lesson_24.semaphore;

import java.util.concurrent.Semaphore;

public class MainSemaphore {
    public static void main(String[] args) throws InterruptedException {
        // Ограничить количество одновременно работающих потоков
        Semaphore semaphore = new Semaphore(3); //fair - не всегда срабатывает
        for (int i = 0; i < 10; i++) {
            new Thread(new ThreadTest(semaphore, i), "Поток - "+i).start();
            Thread.sleep(200);
        }
    }
}

class ThreadTest implements Runnable
{
    Semaphore semaphore;
    int count;
    public ThreadTest(Semaphore semaphore, int count) {
        this.semaphore = semaphore;
        this.count = count;
    }
    public void run() {
        try {

            if(count == 5) semaphore.acquire(3); else semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" начал работать "+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" закончил работать");
            if(count == 5) semaphore.release(3); else semaphore.release();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
