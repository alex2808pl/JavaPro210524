package de.telran.lesson_4;


public class Account {
    private int id; //номер счета
    private int sum;

    public Account(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
