package de.telran.lesson_3.statics;

public class SimpleConst {
    public static final int SIMPLE_CONST_1 = 25;
    public static final int SIMPLE_CONST_2 = 33;
    public static final int SIMPLE_CONST_3;

    static {
        SIMPLE_CONST_3 = SIMPLE_CONST_2 + SIMPLE_CONST_1; // можно инициализировать выражением
    }
}
