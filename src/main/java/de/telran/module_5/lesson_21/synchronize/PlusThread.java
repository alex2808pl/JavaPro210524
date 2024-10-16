package de.telran.module_5.lesson_21.synchronize;

public class PlusThread extends Thread{
    private Account account;
    private int sum;

    public PlusThread(Account account, int sum) {
        this.account = account;
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            account.plusSum(sum);
        }
    }
}
