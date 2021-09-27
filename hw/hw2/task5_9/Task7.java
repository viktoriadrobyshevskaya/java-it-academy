package by.it_academy.hw.hw2.task5_9;

// Задача 7: Необходимо узнать есть ли в строке слова, которые начинаются и заканчиваются на букву "а".

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String str = "анапа, антон, ананас, пушка, аа, АННА, ассистент, норкa, африка";

        Pattern pat = Pattern.compile("\\b[Аа][А-Яа-я]*[Аа]\\b|\\b[Аа]\\b");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
}
