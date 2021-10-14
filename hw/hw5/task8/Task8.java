package by.it_academy.hw.hw5.task8;

//Имеется два файла (INPUT_1.txt и INPUT_2.txt). В третий (OUTPUT.txt) необходимо
//записать только те строки, которые есть и в первом, и во втором.

import java.io.*;
import java.util.*;

public class Task8 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new InputStreamReader(
                new FileInputStream("src/by/it_academy/hw/hw5/task8/INPUT_1.txt")));
             BufferedReader reader2 = new BufferedReader(
                     new InputStreamReader(new FileInputStream("src/by/it_academy/hw/hw5/task8/INPUT_2.txt")));
             BufferedWriter writer = new BufferedWriter(
                     new OutputStreamWriter(new FileOutputStream("src/by/it_academy/hw/hw5/task8/OUTPUT.txt")))) {
            String line = "";
            Set<String> list = new LinkedHashSet<>();
            while ((line = reader1.readLine()) != null) {
                list.add(line);
            }
            while ((line = reader2.readLine()) != null) {
                for (String l : list) {
                    if (l.equals(line)) {
                        writer.write(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
