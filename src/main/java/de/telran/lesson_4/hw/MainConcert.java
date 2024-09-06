package de.telran.lesson_4.hw;

import java.util.List;

public class MainConcert {
        public static void main(String[] args) {
            Singer singer1 = new Singer("Elvis");
            Singer singer2 = new Singer("Madonna");
            Singer singer3 = new Singer("Beyonce");

            Magician mag1 = new Magician("Peter");
            Magician mag2 = new Magician("Mira");
            Magician mag3 = new Magician("Ilina");

            int[] arr = {1,2,3,4,5,6}; // создание массива с помощью литералов

            List<Artist> concert1 = List.of(mag1,mag2,mag3, singer1,singer2,singer3);
            Concert<Artist> concerts = new Concert<>(concert1);
            concerts.process();

            System.out.println("--------------");
            Concert <Artist> concert2 = new Concert<>(mag1,singer3,mag2);
            concert2.process();



        }
}
