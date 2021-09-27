package by.it_academy.hw.hw2.task5_9;

// Задача 6: Необходимо найти самое длинное слово в строке.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String str = "Это предложение, в котором нужно найти самое длинное слово";

        Pattern pattern = Pattern.compile(",?\\b[А-Яа-я_0-9-]*\\b");
        Matcher matcher = pattern.matcher(str);

        int maxLength = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int length = matcher.end() - matcher.start();

        while (matcher.find()) {
            if (length > maxLength) {
                maxLength = length;
                maxStart = matcher.start();
                maxEnd = matcher.end();
            }
        }
        System.out.println("Самое длинное слово - \"" + str.substring(maxStart, maxEnd) + "\"");
    }
}
