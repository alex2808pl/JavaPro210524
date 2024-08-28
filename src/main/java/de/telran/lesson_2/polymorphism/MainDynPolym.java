package de.telran.lesson_2.polymorphism;

import java.util.ArrayList;

public class MainDynPolym {
    public static void main(String[] args) {
        // Динамический полиморфизм на примере переопределение методов

        // динамический полиморфизм при работе с предком
        Dance dance = new Dance("Вася", 15);
        dance.dance();

        HipHopDance hipHopDance = new HipHopDance("Петя", 18);
        hipHopDance.dance();

        BreakDance breakDance = new BreakDance("Гриша", 19);
        breakDance.dance();

        Dance dance1 = new HipHopDance("Леонид", 20);
        dance1.dance();

        dance1 = breakDance;
        dance1.dance();

        // hipHopDance = breakDance; // нельзя

        Dance[] prog1 = {dance, hipHopDance, breakDance};
        koncert(prog1);

        /// Абстрактный класс Singer - динамический полиморфизм при работе с абстрактным классом

        // Singer singer = new Singer("Даша"); //не могу создать объект абстрактного класса
        System.out.println();

        Singer singer1 = new PopSinger("Маша");
        singer1.sing();

        singer1 = new RockSinger("Далила");
        singer1.sing();


        /// интерфейс Playable - динамический полиморфизм при работе с интерфейсом
        
        // Playable playable = new Playable(); //не млгу создать объект интерфейса

        System.out.println();

        // Сужение функционала до поведения, который представлен в интерфейсе
        Playable playable = new ReperPlay("Мирон");
        playable.play();
        playable.speak();

        ReperPlay reperPlay =  new ReperPlay("Лимон");
        reperPlay.play();
        reperPlay.speak();
        reperPlay.dance(); // метод доступен в классе

    }

    static void koncert(Dance[] arr) {
        System.out.println(" === Наш концерт ===");
        for (Dance dance : arr)
            dance.dance();
    }
}
