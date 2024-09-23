package de.telran.module_3.lesson_12;

@FunctionalInterface
interface MyOperation { // только один метод абстрактный
    int operation(int x, int y);

    // любое количество методов c default реализацией
    default int sum (int x, int y)
    {
        methodStatic(); // можем вызывать статические методы, но наоборот!
        return x + y;
    };

    // любое количество статических методов
    static void methodStatic() {
        System.out.println("Я статический метод methodStatic");

    };
}
