package de.telran.module_5.lesson_26.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class MainCopyOnWrite {
    public static void main(String[] args) {
        Publisher cricNext = new Publisher();

        SubScriber raj = new SubScriber("RAJ");
        SubScriber adom = new SubScriber("ADOM");

        cricNext.addSubscriber(raj);
        cricNext.addSubscriber(adom);

        cricNext.notifySubs("FOUR");

        cricNext.notifySubs("SIX");

    }
}

class Publisher {

    private CopyOnWriteArraySet setOfSubs = new CopyOnWriteArraySet();

    public void addSubscriber(SubScriber sub) {
        setOfSubs.add(sub);
    }

    public void notifySubs(String score) {
        Iterator<SubScriber> itr = setOfSubs.iterator();
        while (itr.hasNext()) {
            SubScriber sub = itr.next();
            sub.receive(score);

            setOfSubs.remove(score); // удалять через коллекцию

            //itr.remove(); // not allowed, throws UnsupportedOperationException
        }
    }
}

class SubScriber {

    private String _name;

    public SubScriber(String name) {
        this._name = name;
    }

    public void receive(String score) {
        System.out.printf("[%s] Event received : %s %n", _name, score);
    }
}
