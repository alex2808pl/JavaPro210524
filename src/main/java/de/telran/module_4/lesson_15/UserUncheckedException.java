package de.telran.module_4.lesson_15;

public class UserUncheckedException extends RuntimeException{ //unchecked
    private int codeUserError;

    public UserUncheckedException(String message, int codeUserError) {
        super(message);
        this.codeUserError = codeUserError;
    }

    @Override
    public String toString() {
        return "UserUncheckedException{" +
                "codeUserError=" + codeUserError +
                "} " + super.toString();
    }
}
