package by.it_academy.hw.hw5;
/*
Необходимо реализовать программу, которая будет считывать числа, введенные пользователем, пока пользователь не введет
"стоп" слово. По команде "статус" необходимо вывести введенные цифры в отсортированном виде.  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число. Чтобы закончить - введите \"stop\".");
        String str = "";

        List<Integer> numbers = new LinkedList<>();

        while (true) {
            str = reader.readLine();
            if (str.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                numbers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Это не число. введите число: ");
            }

        }
        while (true) {
            str = reader.readLine();
            if (str.equalsIgnoreCase("status")) {
                Collections.sort(numbers);
                System.out.println(numbers);
                break;
            }
        }
        reader.close();
    }
}
