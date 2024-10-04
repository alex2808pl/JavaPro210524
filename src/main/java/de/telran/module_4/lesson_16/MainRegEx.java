package de.telran.module_4.lesson_16;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegEx {
    public static void main(String[] args) {
        String regEx1 = "www.+", regEx2 = "^[wW]{3}.+";
        String str = "www.telran.de";

        // Многократное использование
        Pattern pattern = Pattern.compile(regEx1);
        Matcher matcher = pattern.matcher(str);
        System.out.println("www.* -> "+matcher.matches());

        pattern = Pattern.compile(regEx2);
        matcher = pattern.matcher(str);
        System.out.println("^[wW]{3}.+ -> "+matcher.matches());

        System.out.println(matcher.start()+" --- "+matcher.end());

        matcher = pattern.matcher("www.i.ua");
        System.out.println("^[wW]{3}.+ -> "+matcher.matches());


        // Однократно проверить
        System.out.println("Однократная проверка 1 -> "+Pattern.matches("www.+", "www.google.com.ua"));
        System.out.println("Однократная проверка 2 -> "+Pattern.matches("www.+", "www.ua.fm"));

        String text = "I1learned2about3Telran4College5and6now7I'm8studying9Java";
        String delimiter = "\\d";

        // через Pattern
        pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] result = pattern.split(text);
        for (String val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

        // split типа String
        Arrays.stream(text.split(delimiter)).forEach(s-> System.out.print(s+" "));
        System.out.println();

        text = "Мама,мыла раму.Мокрой тряпкой?";
        delimiter = "[\\s,.?]"; //на слова
        //delimiter = "";//на символы
        Arrays.stream(text.split(delimiter)).forEach(s-> System.out.print(s+" "));
        System.out.println();

        System.out.println("\\ \" \\d"); //экранирование

    }
}
