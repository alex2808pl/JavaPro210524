package de.telran.module_6.lesson_27.i.refactor;

public class TerminalPaymentService implements CreditCardPayment, PhoneNumberPayment{
    @Override
    public void payCreditCard() {
        //logic
    }
    @Override
    public void payPhoneNumber() {
        //logic
    }
}
