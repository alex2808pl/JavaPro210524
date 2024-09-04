package de.telran.lesson_4;

public class AccountIntarface3<T, S> implements Accountable<T, S>{
    private T id; //номер счета
    private S sum;

    public AccountIntarface3(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public S getSum() {
        return sum;
    }

    @Override
    public void setSum(S sum) {
        this.sum = sum;
    }

    @Override
    public void print() {
        System.out.println(id + " ---- "+sum);
    }
}
