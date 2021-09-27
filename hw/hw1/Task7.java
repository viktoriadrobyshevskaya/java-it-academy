package by.it_academy.hw.hw1;
/*
    Задание *
    Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]. Необходимо написать программу,
    которая посчитает максимально возможную сумму которую можно получить из данного массива, с условием что
    элементы включенные в сумму не должны стоять на соседних индексах (должен быть минимум один елемент между ними).

    Для предложенного массива это: 1, 4, 9 = 14.
 */

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int maxSum;
        int[] array = new int[6];
        fill(array);

        System.out.println(Arrays.toString(array));

        maxSum = calculateMaxSum(array);
        System.out.println("Максимальная сумма = " + maxSum);
    }

    public static void fill(int[] array) {
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10);
        }
    }

    public static int calculateMaxSum(int[] arr) {
        int sum = arr[0];
        int prevSum = 0;

        for (int i = 1; i < arr.length; i++) {
            int temp = sum;
            sum = Math.max(Math.max((prevSum + arr[i]), arr[i]), sum);
            prevSum = temp;
        }
        return sum;
    }
}
