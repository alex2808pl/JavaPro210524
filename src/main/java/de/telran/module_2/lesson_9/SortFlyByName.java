package de.telran.module_2.lesson_9;

import java.util.Comparator;

public class SortFlyByName implements Comparator<Fly> {
    @Override
    public int compare(Fly o1, Fly o2) {
        if(o1.getName().charAt(0) > o2.getName().charAt(0))
            return 1;
        else if(o1.getName().charAt(0) < o2.getName().charAt(0))
            return -1;
        else return 0;
    }
}
