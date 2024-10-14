package de.telran.module_5.lesson_20;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        getCountDiv(0, Integer.MAX_VALUE/2, 13);

        // Thread
        long currentTime = System.currentTimeMillis();
        ThreadTask task1 = new ThreadTask(0, Integer.MAX_VALUE/4, 13);
        ThreadTask task2 = new ThreadTask(Integer.MAX_VALUE/4+1, Integer.MAX_VALUE/2, 13);
        task1.start();
        task2.start();
        // заставляем главный поток ждать завершения дочерних
        task1.join();
        task2.join();
        System.out.println("Общее количество (multi) = "+(task1.count+task2.count));
        System.out.println("Общее время выполнения (Thread) = "+(System.currentTimeMillis()-currentTime));

        // Runnable
        currentTime = System.currentTimeMillis();
        ThreadTaskRun taskRun1 = new ThreadTaskRun(0, Integer.MAX_VALUE/4, 13);
        ThreadTaskRun taskRun2 = new ThreadTaskRun(Integer.MAX_VALUE/4+1, Integer.MAX_VALUE/2, 13);

        Thread th1 = new Thread(taskRun1, "Task1");
        Thread th2 = new Thread(taskRun2, "Task2");
        th1.start();
        th2.start();
        // заставляем главный поток ждать завершения дочерних
        th1.join();
        th2.join();
        System.out.println("Общее время выполнения (Runnable) = "+(System.currentTimeMillis()-currentTime));

        System.out.println("Главный поток завершен");

    }

    private static void getCountDiv(int start, int end, int div) {
        long currentTime = System.currentTimeMillis();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if(i % div == 0) {
                count++;
            }
        }
        System.out.println("Количество = "+count);
        System.out.println("Время выполнения = "+(System.currentTimeMillis()-currentTime));
    }




}
