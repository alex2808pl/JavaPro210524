package de.telran.module_5.lesson_24.exchanger;

import java.util.concurrent.Exchanger;

public class MainExchangerCount {
    public static void main(String[] args) {
        Exchanger<Integer> exchanger = new Exchanger<>();
        new Thread(new Thread1(exchanger),"0..10_000").start();
        new Thread(new Thread2(exchanger), "10_000..100_000").start();

    }
}


class Thread1 implements Runnable {
    Exchanger<Integer> exchanger;

    public Thread1(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" начал работу.");
        int sum = 0;
        for (int i = 0; i < 10_000; i++) {
            if(i % 17 == 0)
                sum+=i;
        }
        try {
            System.out.println(Thread.currentThread().getName()+" ожидает обмена. sum="+sum);
            int res = exchanger.exchange(sum);
            System.out.println(Thread.currentThread().getName()+" получил при обмене -> "+res);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread2 implements Runnable {
    Exchanger<Integer> exchanger;

    public Thread2(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" начал работу.");
        int sum = 0;
        for (int i = 10_000; i < 100_000; i++) {
            if(i % 17 == 0)
                sum+=i;
        }
        try {
            System.out.println(Thread.currentThread().getName()+" ожидает обмена. sum="+sum);
            int res = exchanger.exchange(sum);
            System.out.println(Thread.currentThread().getName()+" получил при обмене -> "+res);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}