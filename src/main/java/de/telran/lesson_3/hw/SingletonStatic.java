package de.telran.lesson_3.hw;

public class SingletonStatic {
    private static SingletonStatic instance;
    public String value;

    private SingletonStatic(String value) {
        this.value = value;
    }

    public static SingletonStatic getInstance(String value) {
        if (instance == null) {
            instance = new SingletonStatic(value);
        }
        return instance;
    }
}
