package by.it_academy.hw.hw5;

//Необходимо написать программу по умножению двух матриц. Пользователь вводит матрицы с клавиатуры.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();

        int[][] array = new int[n][n];
        int[][] array2 = new int[n][n];
        int[][] newArray = new int[n][n];

        System.out.println("Первая матрица:");
        fillArray(array, n);
        printArray(array);

        System.out.println("Вторая матрица:");
        fillArray(array2, n);
        printArray(array2);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[i][j] * array2[i][j];
            }
        }
        System.out.println("Перемноженная матрица:");
        printArray(newArray);
    }

    public static void fillArray(int[][] array, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %d цифр (через пробел или Enter), чтобы заполнить матрицу: ", (n * n));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printArray(int[][] array) {    // метод печатает двумерную матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
