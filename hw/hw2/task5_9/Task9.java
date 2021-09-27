package by.it_academy.hw.hw2.task5_9;
/*
    Задача 9:
    Реализовать программу, которая проверит, содержит ли строка некое слово, и если да то напечатает индекс
    первого символа данного слова.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String str = "какой я печальный";
        String word = "Печальный";

        Pattern pattern = Pattern.compile("\\b" + word.toLowerCase() + "\\b");
        Matcher matcher = pattern.matcher(str.toLowerCase());
        if (matcher.find()) {
            System.out.println(matcher.start());
        }
    }
}
