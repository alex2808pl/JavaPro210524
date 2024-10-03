package de.telran.module_4.lesson_15.homework_031024;

public class WrongLoginException extends RuntimeException{
    private int codeException;

    public WrongLoginException() {
        super("password и confirmPassword должны быть равны! ");
    }

    public WrongLoginException(String message, int codeException) {
        super(message);
        this.codeException = codeException;
    }
}