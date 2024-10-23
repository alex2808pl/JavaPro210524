package de.telran.module_5.lesson_24.cyclic_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainCyclicBarrierAirport {
    public static void main(String[] args) throws Exception {

        // список людей, кто желает полететь на отдых
        String[] personNames = new String[]{"Roman", "Alena", "Kira", "Anna", "Leo", "Bob", "Vladislav", "Inna"};

        CyclicBarrier cyclicBarrier = new CyclicBarrier(personNames.length);


        for (int i = 0; i < personNames.length; i++) {
            new Thread(new PersonInAirportCB(personNames[i], cyclicBarrier)).start();
            Thread.sleep(500);
        }

        System.out.println("===== Главный поток завершился! =======");
    }

}

class PersonInAirportCB implements Runnable {
    private String personName;
    private  CyclicBarrier cyclicBarrier;

    public PersonInAirportCB(String personName, CyclicBarrier cyclicBarrier) {
        this.personName = personName;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {

        try {
            // список дел, которые буду выполнены в рамках каждого потока (человека) самостоятельно
            System.out.println("-> " + personName + " приехал в аэропорт.");
            System.out.println("[!] " + personName + " сдал багаж");
            System.out.println("[!] " + personName + " успел перекусить");

            System.out.println(personName+" ожидает других.");
            cyclicBarrier.await(); // когда count==0 все выходят из состояния ожидания

            // финальное - выполнится то, что находится после await() метода
            System.out.println(personName + " с группой пошел на посадку в самолет");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}