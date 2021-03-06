package by.it_academy.hw.hw5.task8;

//Имеется два файла (INPUT_1.txt и INPUT_2.txt). В третий (OUTPUT.txt) необходимо
//записать только те строки, которые есть и в первом, и во втором.

import java.io.*;
import java.util.*;

public class Task8 {

    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(
                new FileInputStream(args[0])));
             BufferedReader reader2 = new BufferedReader(
                     new InputStreamReader(new FileInputStream(args[1])));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(new FileOutputStream(args[2])))) {
            String line = "";
            Set<String> list = new LinkedHashSet<>();
            while ((line = reader1.readLine()) != null) {
                list.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                if (list.contains(line)) {
                    writer.write(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
