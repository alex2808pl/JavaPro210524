package de.telran.lesson_1.in;

import de.telran.lesson_1.Phone;

public class SimpleInPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("InWork L");
        phone1.call();
        // phone1.model =""; //запрещен доступ
        phone1.setModel(""); // через setter мы можем присвоить значение

    }
}
