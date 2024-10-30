package de.telran.module_6.lesson_27.d.refactor;

import java.math.BigDecimal;

public class Shop {
    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(Object order, BigDecimal amount){
        payments.doTransaction(amount);
    }
}
