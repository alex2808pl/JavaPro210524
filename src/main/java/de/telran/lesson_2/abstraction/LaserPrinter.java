package de.telran.lesson_2.abstraction;

public class LaserPrinter extends Printer {
    int countPrintPages; //количество листов, которые он может напечатать на одной заправке

    public LaserPrinter(String name, String model, int year, int countPrintPages) {
        System.out.println("--- Работает конструктор LaserPrinter::LaserPrinter()");
        super.name = name;
        super.model = model;
        this.year = year; // хотя эта переменная объявлена в предке, но она уже унаследована потомком, поэтому могу исп. this
        this.countPrintPages = countPrintPages;
    }

    public LaserPrinter(int countPrintPages) {
        this.countPrintPages = countPrintPages;
    }

    @Override
    void refill() {
        System.out.println(name + " заправляется заменой лазерного картриджа");
    }

    @Override
    void print() {
        System.out.println(name + " печатает с помощью лазера и тонера");
    }
}
