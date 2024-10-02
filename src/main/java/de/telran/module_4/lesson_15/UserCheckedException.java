package de.telran.module_4.lesson_15;

public class UserCheckedException extends Exception{ //checked
    private int codeUserError;

    public UserCheckedException(String message, int codeUserError) {
        super(message);
        this.codeUserError = codeUserError;
    }

    @Override
    public String toString() {
        return "UserCheckedException{" +
                "codeUserError=" + codeUserError +
                "} " + super.toString();
    }
}
