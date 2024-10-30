package de.telran.module_6.lesson_27.l.refactor;

import java.math.BigDecimal;

public class PaymentAccount extends Account{
    // оплата со счета (cнятие денег)
    public void payment(String numberAccount, BigDecimal sum){
        //logic
        System.out.println("Оплачиваем со счета "+numberAccount+" сумму "+sum);
    }
}
