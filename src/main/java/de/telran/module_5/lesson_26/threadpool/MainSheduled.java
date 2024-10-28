package de.telran.module_5.lesson_26.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainSheduled {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2); //размер пула
        executorService.scheduleAtFixedRate(new TaskShedule(), 0, 5, TimeUnit.SECONDS); // повторять
    }
}

class TaskShedule implements Runnable {
    @Override
    public void run() {
        System.out.println("Проверяем почту..."+Thread.currentThread().getName());
    }
}
