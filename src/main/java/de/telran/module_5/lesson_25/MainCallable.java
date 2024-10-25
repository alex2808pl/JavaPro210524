package de.telran.module_5.lesson_25;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> taskAnonym = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                // Какие то вычисления в потоке
                return "Hello, World! Anonym";
            }
        };

        Callable taskLambda = () -> {
            Thread.sleep(2000);
            // Какие то вычисления в потоке
            return "Hello, World! Lambda";
        };

        FutureTask<String> future = new FutureTask<>(taskAnonym);
        new Thread(future).start();
        System.out.println(future.get()); //ждем пока поток не отработает
        System.out.println("isDone = "+future.isDone());
        System.out.println("isCancelled = "+future.isCancelled());

        future = new FutureTask<>(taskLambda);
        new Thread(future).start();
        System.out.println(future.get()); //ждем пока поток не отработает

    }
}
