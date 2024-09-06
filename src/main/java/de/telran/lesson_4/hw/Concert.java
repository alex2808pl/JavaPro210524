package de.telran.lesson_4.hw;

import java.util.Arrays;
import java.util.List;

public class Concert <T extends Artist> {
    //Вы владелец концертного зала со сценой. Вы нанимаете артистов различного жанра, которые развлекают зрителей,
    // используя свои таланты. Реализуйте класс Концерт, в котором разные артисты будут выходить на сцену и развлекать зрителей используя свои умения и талант.
    // Подумайте, можно для класса Концерт применить Generiс подход к реализации?
    private List<T> t;

    public Concert(T... t) { //int ... a; Double ... d; (5,8,9,3,7) -> int[]  //vararg
        this.t = Arrays.stream(t).toList();
    }

    public Concert(List<T> t) {
        this.t = t;
    }

    public void process() {
        for (T talant : t) {
            talant.showTalent();

        }
    }
}