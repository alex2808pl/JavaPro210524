package de.telran.module_5.lesson_22.ht;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainShooter {
    public static void main(String[] args) throws InterruptedException {
        AtomicBoolean isHit = new AtomicBoolean(false);
        Thread[] shooters = new Thread[5];
        for (int i = 0; i < 5; i++) {
            shooters[i] = new Thread(new Shooter(isHit), "Стрелок "+(i+1));
            shooters[i].start();
            Thread.sleep(100);
        }

        for (int i = 0; i < 5; i++) {
            shooters[i].join();
        }
    }
}

class Shooter implements Runnable {
    private AtomicBoolean isHit;

    public Shooter(AtomicBoolean isHit) {
        this.isHit = isHit;
    }

    @Override
    public void run() {
        Random random = new Random();

        if(!isHit.get()) {
             isHit.set(random.nextBoolean()); //выстрел
            System.out.println(Thread.currentThread().getName()+" его выстрел -> "+isHit.get());
        } else {
            System.out.println(Thread.currentThread().getName()+" не стреляет, т.к. мишень поражена");
        }
    }
}
