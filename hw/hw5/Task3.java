package by.it_academy.hw.hw5;

//Необходимо реализовать программу, которая будет считывать числа, введенные пользователем, пока пользователь
// не введет "стоп" слово. После чего программа выведет среднее из всех введенных значений.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    private static final String WORD = "stop";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Введите число. Чтобы закончить - введите \"%s\".\n", WORD);
        String str = "";
        double sum = 0;
        int count = 0;
        try {
            while (true) {
                str = reader.readLine();
                if (str.equalsIgnoreCase(WORD)) {
                    break;
                }
                try {
                    sum += Integer.parseInt(str);
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число. Попробуйте снова: ");
                }
            }
            System.out.println("Среднее значение введенных чисел: " + sum / count);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
