package de.telran.module_3.lesson_12;

public class SumMyOperation implements MyOperation{
    @Override
    public int operation(int x, int y) {
        return x+y;
    }

    public String methodClass() {
        return "Я метод MethodClass класса SumMyOperation";
    }
}
