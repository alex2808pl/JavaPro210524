package de.telran.module_5.lesson_21.synchronize;

public class Account {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public synchronized void plusSum(int val) {
        this.sum += val;
    }

    public synchronized void minusSum(int val) {
        this.sum -= val;
    }
}
