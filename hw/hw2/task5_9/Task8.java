package by.it_academy.hw.hw2.task5_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Задача 8:
    Необходимо извлечь из строки и распечатать номер карты (XXXX-XXXX-XXXX-XXXX) если он там есть.
 */
public class Task8 {
    public static void main(String[] args) {
        String str = "Ваша карта N 2589-7859-7458-8521 заменена на карту N 4545-7854-8456-4751.";
        String[] arr = str.split("\s");

        Pattern pat = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}");

        for (int i = 0; i < arr.length; i++) {
            Matcher mat = pat.matcher(arr[i]);
            if (mat.find()) {
                System.out.println(mat.group());
            }
        }
    }
}
