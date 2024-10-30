package de.telran.module_6.lesson_27.l.refactor;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    @Override
    public BigDecimal balance(String numberAccount){
        //logic
        return new BigDecimal(333);
    };
    @Override
    public void refill(String numberAccount, BigDecimal sum){
        //logic
    }
}
