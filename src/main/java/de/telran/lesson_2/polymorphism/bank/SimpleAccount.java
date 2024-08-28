package de.telran.lesson_2.polymorphism.bank;

// Разграничение доступа к функциональности класса через интерфесы

public class SimpleAccount {
    public static void main(String[] args) {
        Account account = new Account("1234567890", 120,"Вася Пупкин","22.02.2024");

        // Происходит сужение функциональности до перечня тех методов, которые опубликованны в интерфейсе Cashier
        // Другие методы класса Account становятся недоступны (данный подход используется для безопасности)
        Cashier cashier = account;
        System.out.println("На счете номер "+ cashier.getNum() +" денег = "+cashier.getSum());

        Manager manager = account;
        System.out.println("Cчет номер "+ manager.getNum() +" создан = "+manager.getDateCreate());

        Client client = account;
        System.out.println("Cчет номер "+ client.getNum() +" принадлежит = "+client.getName());

    }
}
