package by.it_academy.hw.hw2.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Задача 3:
    Необходимо создать класс, который имеет метод, чтобы накапливать 5 последних переданных
    в него цифровых значений. Так же необходимо создать метод, который выводит
    среднее из накопленных значений.
 */
public class Keeper {
    private int[] array = new int[5];
    private int count = 0;

    public void addNumbers(int number) {
        array[count] = number;
        count++;
        if (count == 5) {
            count = 0;
        }
    }

    public void averageValue() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Среднее значение из накопленных = " + sum / array.length);
    }

}
