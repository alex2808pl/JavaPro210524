package de.telran.module_4.lesson_15.practice;

public class UserException extends RuntimeException{
    private int codeException;

    public UserException(String message, int codeException) {
        super(message);
        this.codeException = codeException;
    }

    @Override
    public String toString() {
        return "UserEmailException{" +
                "codeException=" + codeException +
                '}';
    }
}
