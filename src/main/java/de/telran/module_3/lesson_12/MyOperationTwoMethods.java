package de.telran.module_3.lesson_12;

// @FunctionalInterface - это не функциональный интерфейс, т.к. 2 и более абстрактных методов
interface MyOperationTwoMethods {
    int operation(int x, int y);
    double operationDouble(double x, double y);
}
