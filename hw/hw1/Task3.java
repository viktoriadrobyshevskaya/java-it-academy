package by.it_academy.hw.hw1;
/*
    Задание 3
    Дан некоторый массив, суть задания инвертировать его.
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));

    }
}
