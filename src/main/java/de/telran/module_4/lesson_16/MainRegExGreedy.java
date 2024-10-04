package de.telran.module_4.lesson_16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegExGreedy {
    public static void main(String[] args) {
        String str = "Егор Анна Александр";
        //String regEx = "А.+а"; //жадный (исп.по умолчанию)
        String regEx = "А.+?а"; //ленивый (не работает с matches())

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.start()+" --- "+ matcher.end());
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }

        Pattern pattern1 = Pattern.compile(regEx);
        Matcher matcher1 = pattern1.matcher(str);
        System.out.println(matcher1.find());
        System.out.println(matcher1.start()+" --- "+ matcher1.end());


    }
}
