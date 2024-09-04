package de.telran.lesson_4;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] arrInt = {1,2,3,4,5};
        String[] arrStr = {"s1","s2","s3","s4","s5"};
        Boolean[] arrBool = {true,false,true};

        printer.print(arrInt);
        // printer.print(arrStr); // нельзя - аргумент не int типа

        // --- Методы с Generic
        printer.<String>print(arrStr);
        printer.<Integer>print(arrInt);
        printer.<Boolean>print(arrBool);
    }
}
