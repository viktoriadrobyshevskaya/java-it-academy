package by.it_academy.hw.hw5.task7;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* Прочитать файл (INPUT.txt), в выходной файл (OUTPUT.txt) записать все строки из первого,
    но в обратном порядке (первая строка должна быть последней).*/

public class Task7 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(args[0])));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream(args[1])))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            for (int i = list.size() - 1; i > 0; i--) {
                writer.write(list.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}