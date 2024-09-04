package de.telran.lesson_4;

public interface Accountable<T, S> extends Sumable<S>, IdVisibleable<T>{
    void print();
}
