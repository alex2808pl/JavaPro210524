package de.telran.lesson_2.abstraction;

public class MainPrinter {
    public static void main(String[] args) {
        LaserPrinter laserPrinter = new LaserPrinter("HP", "LJ100",2005, 1000);
        laserPrinter.repair();
        laserPrinter.service();
        laserPrinter.gasstation();
        laserPrinter.print();

        System.out.println();

        JetPrinter jetPrinter = new JetPrinter("Epson", "Jet200", 2010);
        jetPrinter.repair();
        jetPrinter.service();
        jetPrinter.gasstation();
        jetPrinter.print();

        Printer printer = new Printer();
    }
}
