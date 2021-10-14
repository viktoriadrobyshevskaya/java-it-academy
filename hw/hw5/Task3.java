package by.it_academy.hw.hw5;

//Необходимо реализовать программу, которая будет считывать числа, введенные пользователем, пока пользователь
// не введет "стоп" слово. После чего программа выведет среднее из всех введенных значений.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число. Чтобы закончить - введите \"stop\".");
        String str = "";
        double sum = 0;
        int count = 0;

        while (true) {
            str = reader.readLine();
            if (str.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                sum += Integer.parseInt(str);
                count++;
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println("Среднее значение введенных чисел: " + sum / count);
        reader.close();
    }
}
