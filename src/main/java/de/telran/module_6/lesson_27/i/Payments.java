package de.telran.module_6.lesson_27.i;

//Interface segregation principle – принцип разделения интерфейса
//        (много специализированных интерфейсов лучше, чем один универсальный);

// i - нарущение, т.к. есть один большой универсальній интерфейс
public interface Payments {
    void payWebMoney();
    void payCreditCard();
    void payPhoneNumber();
}
