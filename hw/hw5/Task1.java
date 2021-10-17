package by.it_academy.hw.hw5;

//Необходимо реализовать программу, которая будет считывать строки, введенные пользователем и выводить их в консоль.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    private static final String WORD = "stop";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Введите строку. Чтобы закончить - введите \"%s\". \n", WORD);
        String str = "";
        while (true) {
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.equalsIgnoreCase(WORD)) {
                break;
            }
            System.out.println(str);
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
