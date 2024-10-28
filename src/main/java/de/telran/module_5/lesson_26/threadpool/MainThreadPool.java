package de.telran.module_5.lesson_26.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPool {
    public static void main(String[] args) throws InterruptedException {
        //ExecutorService executorService = Executors.newFixedThreadPool(5); //ограничен МАX количество
        //ExecutorService executorService = Executors.newSingleThreadExecutor(); //всегда только один поток
        //ExecutorService executorService = Executors.newCachedThreadPool(); //использует освободившиеся потоки, нет ограничения
        ExecutorService executorService = Executors.newWorkStealingPool(2); //использует указанное количество ядер

        for (int i = 0; i < 30; i++) {
            executorService.execute(new Task(i+1));
            Thread.sleep(500);
        }

        executorService.shutdown();
    }
}

class Task implements Runnable {
    int taskNumber;

    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // иммитируем работу
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Обработан запрос пользователя №" + taskNumber + " на потоке " + Thread.currentThread().getName());
    }
}