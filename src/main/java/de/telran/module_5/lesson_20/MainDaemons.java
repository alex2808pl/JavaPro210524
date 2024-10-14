package de.telran.module_5.lesson_20;

public class MainDaemons {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Главный поток стартовал! " + Thread.currentThread().getName());

        // Анонимный класс
        Thread thAnonym = new Thread("AnonymClass") {
            public void run() {

                try {
                    System.out.println("Run task Anonim -> "+Thread.currentThread().getName());
                    Thread.sleep(2000); // иммитируем загруженность на 2 сек паралельного потока
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("End Task Anonim -> "+Thread.currentThread().getName());
            }

        };

        //Анонинмный класс через Runnable
        Runnable runnable = () -> {
            try {
                System.out.println("Run task Anonim Runnable -> "+Thread.currentThread().getName());
                Thread.sleep(3000); // иммитируем загруженность на 3 сек паралельного потока
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("End task Anonim Runnable -> "+Thread.currentThread().getName());
        };
        Thread thAnonymRunnable = new Thread(runnable, "AnonymRunnable");

        // принудительное закрытие дочерних потоков при завершении работы главного потока!
        thAnonym.setDaemon(true);
        thAnonymRunnable.setDaemon(true);

        // запускаем оба потока
        thAnonym.start();
        thAnonymRunnable.start();


        Thread.sleep(1000); // иммитируем загруженность на 1 сек главного потока
        System.out.println("Главный поток завершен! " + Thread.currentThread().getName());

    }
}
