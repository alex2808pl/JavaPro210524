package de.telran.module_5.lesson_22;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainCounter {
    public static void main(String[] args) throws InterruptedException {
        CounterClassic cc = new CounterClassic();
        Thread thread1Classic = new Thread(cc, "First");
        Thread thread2Classic = new Thread(cc, "Second");

        thread1Classic.start();
        thread2Classic.start();

        thread1Classic.join();
        thread2Classic.join();

        // Прогноз counter = 1_000_000 (First) + 1_000_000 (Second) = 2_000_000;
        System.out.println("Classic = " + cc.getCounter());

        // --- Решаем проблему synchronized

        CounterSync cs = new CounterSync();
        Thread thread1Sync = new Thread(cs, "First");
        Thread thread2Sync = new Thread(cs, "Second");

        thread1Sync.start();
        thread2Sync.start();

        thread1Sync.join();
        thread2Sync.join();

        // Прогноз counter = 1_000_000 (First) + 1_000_000 (Second) = 2_000_000;
        System.out.println("Synchronized = " + cs.getCounter());


        // --- Решаем проблему Atomic

        CounterAtomic ca = new CounterAtomic();
        Thread thread1Atomic  = new Thread(ca, "First");
        Thread thread2Atomic  = new Thread(ca, "Second");

        thread1Atomic.start();
        thread2Atomic.start();

        thread1Atomic.join();
        thread2Atomic.join();

        // Прогноз counter = 1_000_000 (First) + 1_000_000 (Second) = 2_000_000;
        System.out.println("Atomic = " + ca.getCounter());


        // --- Решаем проблему Lock

        CounterLock cl = new CounterLock();
        Thread thread1Lock  = new Thread(cl, "First");
        Thread thread2Lock  = new Thread(cl, "Second");

        thread1Lock.start();
        thread2Lock.start();

        thread1Lock.join();
        thread2Lock.join();

        // Прогноз counter = 1_000_000 (First) + 1_000_000 (Second) = 2_000_000;
        System.out.println("Lock = " + cl.getCounter());


        // --- Решаем проблему MultiLock

        MultiLock ml = new MultiLock();
        Thread multi1Lock  = new Thread(ml, "First");
        Thread multi2Lock  = new Thread(ml, "Second");

        multi1Lock.start();
        multi2Lock.start();

        multi1Lock.join();
        multi2Lock.join();

        // Прогноз counter = 1_000_000 (First) + 1_000_000 (Second) = 2_000_000;
        System.out.println("MultiLock: count = " + ml.getCounter()+", sum = "+ml.getSum()+", max = "+ml.getMax());
    }
}

class CounterClassic extends Thread {
    private volatile int counter = 0; // убираем кэши volatile (не помогло)

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        int max = 1_000_000;

        for (int i = 0; i < max; i++) {
            ++counter;
            // tmp = getCounter(); // получаем
            // tmp = tmp+1; // увеличиваем
            // применяем tmp
            // setCounter(tmp);
        }
    }
}

class CounterSync extends Thread {
    private volatile int counter = 0; // убираем кэши volatile

    public int getCounter() {
        return counter;
    }

    @Override
   // public synchronized void run() { // нельзя, т.к. все будет выполняться последовательно
   public void run() {
        int max = 1_000_000;

        for (int i = 0; i < max; i++) {
            synchronized (this) {
                //System.out.println(Thread.currentThread().getName()+" -> "+i);
                ++counter;
            }
        }
    }
}

class CounterAtomic extends Thread {
    private AtomicInteger counter = new AtomicInteger(); // убираем кэши volatile

    public int getCounter() {
        return counter.get();
    }

    @Override
    public void run() {
        int max = 1_000_000;

        for (int i = 0; i < max; i++) {
                counter.incrementAndGet();
        }
    }
}


// Lock используется для раздельного доступа к различным переменным или методам
class CounterLock extends Thread {
    private int counter = 0;
    private Lock myLock = new ReentrantLock();

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        int max = 1_000_000;

        for (int i = 0; i < max; i++) {
            myLock.lock();
            try {
                ++counter;
            }
            finally {
                myLock.unlock();
            }
        }
    }
}

class MultiLock extends Thread {
    private int counter = 0;
    private long sum = 0;
    private int max = 0;

     private Lock lockCounter = new ReentrantLock();
    private Lock lockSum = new ReentrantLock();
    private Lock lockMax = new ReentrantLock();

    public int getCounter() {
        return counter;
    }

    public long getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        int countVal = 1_000_000;

        for (int i = 0; i < countVal; i++) {

            lockCounter.lock();
            try {
                counter = calcCount(counter);
             }
            finally {
                lockCounter.unlock();
            }

            lockSum.lock();
            try {
                sum = calcSum(sum, i);
            }
            finally {
                lockSum.unlock();
            }

            lockMax.lock();
            try {
                max = calcMax(max, i);
            }
            finally {
                lockMax.unlock();
            }
        }
    }

    int calcCount(int count) {
        int tmp = count;
        tmp = tmp + 1;
        return tmp;
    }

    long calcSum(long sum, int val) {
        long tmp = sum;
        tmp = tmp + val;
        return tmp;
    }

    int calcMax(int max, int val) {
        int tmp = max;
        if(tmp < val)
            tmp = val;
        return tmp;
    }
}


