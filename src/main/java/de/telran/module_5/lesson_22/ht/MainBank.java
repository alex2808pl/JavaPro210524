package de.telran.module_5.lesson_22.ht;

import java.util.Arrays;
import java.util.Random;

public class MainBank {
    public static void main(String[] args) throws InterruptedException {
        int [] accounts = new int[100];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = 1000;
        }

        System.out.println("Сумма на счете на начало рабочего дня :"+ Arrays.stream(accounts).sum());

        Thread[] operations = new Thread[10_000];
        for (int i = 0; i < operations.length; i++) {
            operations[i] = new Thread(new Operation(accounts), "Операция "+(i+1));
            operations[i].start();
        }
        for (int i = 0; i < operations.length; i++) {
            operations[i].join();
        }

        System.out.println("Сумма на счете на КОНЕЦ рабочего дня :"+ Arrays.stream(accounts).sum());
    }
}

class Operation implements Runnable {
    int [] accounts;

    public Operation(int[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public void run() {
        Random random = new Random();
        int accountIndexGet = random.nextInt(100);
        int accountIndexPut = random.nextInt(100);
        int sum = random.nextInt(1000); // сумма
        synchronized (accounts) {
            if (accounts[accountIndexGet] >= sum) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                accounts[accountIndexGet] -= sum; // c этого счета забираем
                accounts[accountIndexPut] += sum; // на этот счет кладем
                System.out.println(accountIndexGet + " -> " + accountIndexPut + " = " + sum);
            } else {
                System.out.println("!!!! Не достаточно средств: " + accountIndexGet + "(" + accounts[accountIndexGet] + ") -> " + accountIndexPut + " = " + sum);
            }
        }
    }
}

//
//3**. Вы открыли банк. У вас есть массив из 1000 счетов клиентов. На каждом клиентском счете 1000 евро.
//Просчитайте общее количество денег на счетах клиентов.
//Представьте что за день, у вас в банке было проведено 10 000 операций.
//В каждой операции вы выбираете 2 случайных счета:
//с одного снимаете сумму например 10 евро и добавляете на другой счет эту же сумму.
//Просчитайте общее количество денег на счетах клиентов.
//У вас баланс денежных средств на счетах клиентов до начала операций должен быть равен количеству денег после окончание дня.
//Если это не так, то как Вы думаете почему?  Можно ли это исправить и как?