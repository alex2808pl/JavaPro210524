package de.telran.module_2.lesson_11.hw;

//4)* Сгруппируйте слова с одинаковым набором символов, желательно используя Map.
//Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
//вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//Выход:
//student, students,
//cat, act,
//dog, god,
//flow, wolf

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        System.out.println("Слова с одинаковым набором символов: " + sortWords(words));
    }

    private static List<Map<String, String>> sortWords(String[] words) {

        List<Map<Character, Boolean>> wordsAsMapList = new ArrayList<>();
        for (String word: words) {
            Map<Character, Boolean> wordAsMap = new HashMap<>();
            for (char c: word.toCharArray()) {
                wordAsMap.put(c, true);
            }
            wordsAsMapList.add(wordAsMap);
        }

        List<Map<String, String>> matchesMapList = new ArrayList<>();
        for (int i=0; i < wordsAsMapList.size()-1; i++) {
            Map<String, String> matchesMap = new HashMap<>();
            for (int j = i+1; j < wordsAsMapList.size(); j++) {
                if (wordsAsMapList.get(i).equals(wordsAsMapList.get(j))){
                    matchesMap.put(words[i], words[j]);
                    matchesMapList.add(matchesMap);
                }
            }
        }
        return matchesMapList;
    }


}
