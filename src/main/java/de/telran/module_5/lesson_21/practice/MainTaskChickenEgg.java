package de.telran.module_5.lesson_21.practice;

import java.util.Scanner;

public class MainTaskChickenEgg {
    public static void main(String[] args) throws InterruptedException {
        Thread chicken = new Thread(
                () -> {
                    try {
                        while (true) {
                            countSimple(2, 100_000);//Imitation of working
                            if (Thread.interrupted()) {
                                System.out.println("Winner is chicken -  Is working");
                                return;
                            }
                            System.out.println("Chicken");

                            Thread.sleep(1000);

                        }
                    } catch (InterruptedException e) {
                        System.out.println("Winner is chicken -- Exception");
                        //throw new RuntimeException(e);
                        return;
                    }

                }
        );
        Thread egg = new Thread(
                () -> {
                    try {
                        while (true) {

                            countSimple(2, 100_000);//Imitation of working
                            if (Thread.interrupted()) {
                                System.out.println("Winner is egg - Is working");
                                return;
                            }
                            System.out.println("Egg");

                            Thread.sleep(1000);


                        }
                    } catch (InterruptedException e) {
                        System.out.println("Winner is egg - Exception");
                        //throw new RuntimeException(e);
                        return;
                    }

                }
        );
        System.out.println("Who is first? ");
        chicken.setDaemon(true);
        egg.setDaemon(true);
        chicken.start();
        egg.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Who is true?");
        int scan = scanner.nextInt();
        if (scan == 1) {
            System.out.println(chicken.getState());
            chicken.interrupt();
        } else if (scan == 2) {
            egg.interrupt();

        } else {

            System.out.println("I am fad up with you");
        }

        Thread.sleep(1000);
    }

    private static int countSimple(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }
        return count;
    }
}
