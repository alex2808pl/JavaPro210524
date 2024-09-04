package de.telran.lesson_4;

public class AccountInterface2<T> implements Sumable<T>{
    private int id;
    private T sum;

    public AccountInterface2(int id, T sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getSum() {
        return sum;
    }

    @Override
    public void setSum(T sum) {
        this.sum = sum;
    }

    public int getId() {
        return id;
    }
}
