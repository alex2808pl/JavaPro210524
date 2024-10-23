package de.telran.module_5.lesson_24.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class SimpleCountDownLatchTraffic {
    public static void main(String[] args) throws Exception {

        CountDownLatch countDownLatch = new CountDownLatch(3);

        Thread service1 = new Thread(new Service("Скорая", countDownLatch, 3000));
        Thread service2 = new Thread(new Service("Полиция", countDownLatch, 5000));
        Thread service3 = new Thread(new Service("Дорожная служба", countDownLatch, 8000));

        for (int i = 0; i < 10; i++) {
            new Thread(new Auto(countDownLatch), "Авто "+i).start();
            Thread.sleep(700);
        }
        service1.start();
        service2.start();
        service3.start();

    }
}

class Auto implements Runnable {
    private CountDownLatch countDownLatch;

    public Auto(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName()+" авто подьехала к проблемному участку!");
            countDownLatch.await(); //ждут пока не дадут добро к началу движения (countDownLatch==0)
            System.out.println(Thread.currentThread().getName()+" авто едет дальше!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Service implements Runnable {
    private String personName;
    private CountDownLatch countDownLatch;

    private int time;

    public Service(String personName, CountDownLatch countDownLatch, int time) {
        this.personName = personName;
        this.countDownLatch = countDownLatch;
        this.time = time;
    }

    @Override
    public void run() {

        try {
            System.out.println("-> " + personName + " начинает свою работу!");
            Thread.sleep(time); //иммитируем работу службы
            System.out.println(personName+" закончила работу.");
            countDownLatch.countDown(); //-1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
