package by.it_academy.hw.hw1;

/*
    Задание 6
    Даны две квадратные матрицы. Необходимо написать программу которая посчитает их сумму и разности.
 */

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int n = 3;
        int[][] array = new int[n][n];
        int[][] array2 = new int[n][n];
        int[][] sumArray = new int[n][n];
        int[][] subtrArray = new int[n][n];

        System.out.println("Первая матрица:");
        fillArray(array);
        printArray(array);

        System.out.println("Вторая матрица:");
        fillArray(array2);
        printArray(array2);

        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                sumArray[i][j] = array[i][j] + array2[i][j];
            }
        }
        System.out.println("Матрица, состоящая из суммы двух матриц:");
        printArray(sumArray);

        for (int i = 0; i < subtrArray.length; i++) {
            for (int j = 0; j < subtrArray[i].length; j++) {
                subtrArray[i][j] = array[i][j] - array2[i][j];
            }
        }
        System.out.println("Матрица, состоящая из разности двух матриц:");
        printArray(subtrArray);

    }

    public static void fillArray(int[][] array) {    // метод заполняет матрицу рандомными значениями
        Random ran = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(10);
            }
        }
    }

    public static void printArray(int[][] array) {    // метор печатает двумерную матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
