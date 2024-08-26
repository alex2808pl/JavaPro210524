package de.telran.lesson_2.interface1.inter;

import de.telran.lesson_2.interface1.Bird;

public interface Flyable { //extends Bird наследование класса запрещено
    int k = 10; // final static подразумевается
    void fly(); //abstract можно не писать, оно подразумевается автоматически
}
