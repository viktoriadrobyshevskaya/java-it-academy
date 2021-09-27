package by.it_academy.hw.hw1;

/*
    Задание 4
    Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
    положительных или отрицательных.
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int negNum = 0;
        int posNum = 0;
        int[][] array = {{-2, 3, -8, 2, 9, -4, -3}, {5, -7, 8, 5, -1, -9, -2}};

        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    posNum++;
                } else {
                    negNum++;
                }
            }
        }

        System.out.println(String.format("В массиве - %d положительных чисел и %d - отрицательных.", posNum, negNum));
    }
}
