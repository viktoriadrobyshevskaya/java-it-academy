package by.it_academy.hw.hw2.task5_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Задача 5:
    Необходимо посчитать количество слов в строке, в которых буква "с" встречается 3 и более раз.
 */
public class Task5 {
    public static void main(String[] args) {
        int count = 0;
        String str = "аксессуар, пёс, ассистент, СС4С4, дискуссия, самолет, диссонанс, консенсус, брус, синтаксис, СССР";

        Pattern pat = Pattern.compile("\\S*[Сс]\\S*[Сс]\\S*[Сс]\\S*");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            System.out.println(str.substring(mat.start(), mat.end()));
            count++;
        }

        System.out.println("Количество слов с тремя буквами \"с\" - " + count);
    }
}