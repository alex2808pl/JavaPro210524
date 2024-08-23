package de.telran.lesson_2.abstraction;

public class JetPrinter extends Printer{

    public JetPrinter(String name, String model, int year) {
        System.out.println("--- Работает конструктор JetPrinter::JetPrinter()");
        this.name = name;
        this.model = model;
        this.year = year; // хотя эта переменная объявлена в предке, но она уже унаследована потомком, поэтому могу исп. this
    }

    @Override
    void gasstation() {
        System.out.println(name + " заправляется заменой картриджа с краской");
    }

    @Override
    void print() {
        System.out.println(name + " печатает распыляя краску и катриджа");
    }
}
