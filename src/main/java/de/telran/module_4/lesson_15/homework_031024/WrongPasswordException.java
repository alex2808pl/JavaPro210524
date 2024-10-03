package de.telran.module_4.lesson_15.homework_031024;

public class WrongPasswordException extends RuntimeException{
    private int codeException;

    public WrongPasswordException() {
        super("password и confirmPassword должны быть равны! ");
    }

    public WrongPasswordException(String message, int codeException) {
        super(message);
        this.codeException = codeException;
    }
}
