package by.it_academy.hw.hw5;

//Необходимо реализовать программу, которая будет считывать строки, введенные пользователем и выводить их в консоль.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку. Чтобы закончить - введите \"stop\".");
        String str = "";
        while (true) {
            str = reader.readLine();
            if (str.equalsIgnoreCase("stop")){
                break;
            }
            System.out.println(str);
        }
        reader.close();
    }
}
