package de.telran.lesson_1;

public class Phone {
    String name; // default, доступны внутри package и внутри класса
    String model;
    private String company; //доступны только внутри класса
    public int year;

    public void call() {
        System.out.println("Вызываю абонемента - "+name);
    }

    public void receive() {
        System.out.println("Принимаю звонок - "+name);
    }

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String model, String company, int year) {
        this.name = name;
        this.model = model;
        this.company = company;
        this.year = year;
    }

    public void setCompany(String company) {
        if(company == null || company == "") {
            System.out.println("Не корректное значение");
        }
        else {
            this.company = company;
        }
    }

    public String getCompany() {
        // проверка доступности данной характеристики, например по секьюрити
        if(company != "Секретная")
            return company;
        return null;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
