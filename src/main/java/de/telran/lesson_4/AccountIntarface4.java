package de.telran.lesson_4;

public class AccountIntarface4<T, S> implements IdVisibleable<T>, Sumable<S>{
    private T id; //номер счета
    private S sum;

    public AccountIntarface4(T id, S sum) {
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

}
