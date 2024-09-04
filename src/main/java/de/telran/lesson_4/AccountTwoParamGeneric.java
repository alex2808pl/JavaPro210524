package de.telran.lesson_4;


public class AccountTwoParamGeneric<T, S extends Number> { // S можно передать только наследники класса Number
    private T id; //номер счета
    private S sum;

    public AccountTwoParamGeneric(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
