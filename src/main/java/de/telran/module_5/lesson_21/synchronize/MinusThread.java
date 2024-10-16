package de.telran.module_5.lesson_21.synchronize;

public class MinusThread extends Thread{
    private Account account;
    private int sum;

    public MinusThread(Account account, int sum) {
        this.account = account;
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {

            account.minusSum(sum);

        }

    }
}
