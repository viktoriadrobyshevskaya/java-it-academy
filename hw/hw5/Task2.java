package by.it_academy.hw.hw5;

//Необходимо написать программу по умножению двух матриц. Пользователь вводит матрицы с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите n: ");
            int n = 0;
            int[][] array;
            int[][] array2;
            int[][] newArray;
            while (true) {
                try {
                    n = Integer.parseInt(reader.readLine());
                    array = new int[n][n];
                    array2 = new int[n][n];
                    newArray = new int[n][n];
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
                } catch (NumberFormatException e) {
                    System.out.println("Вы должны ввести число:");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fillArray(int[][] array, int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Введите %d цифр (через пробел или Enter), чтобы заполнить матрицу: ", (n * n));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    array[i][j] = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException | IOException e) {
                    System.out.println("Это не число. Попробуйте еще.");
                    array[i][j] = Integer.parseInt(reader.readLine());
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}
