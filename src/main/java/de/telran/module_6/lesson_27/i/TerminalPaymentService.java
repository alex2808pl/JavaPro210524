package de.telran.module_6.lesson_27.i;

public class TerminalPaymentService implements Payments{
    @Override
    public void payWebMoney() {
        throw new UnsupportedOperationException("Operation not supported");
        //????
    }

    @Override
    public void payCreditCard() {
        //logic
    }

    @Override
    public void payPhoneNumber() {
        //logic
    }
}
