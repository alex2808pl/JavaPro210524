package de.telran.module_6.lesson_27.l.refactor;

import java.math.BigDecimal;

public class SalaryAccount extends PaymentAccount{
    @Override
    public BigDecimal balance(String numberAccount){
        //new logic
        return new BigDecimal(1000);
    };
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //new logic
    }
    @Override
    public void payment(String numberAccount, BigDecimal sum){
        //new logic
        System.out.println("Оплачиваем со SalaryAccount "+numberAccount+" сумму "+sum);
    }
}
