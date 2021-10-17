package by.it_academy.hw.hw5.task6;

//Необходимо написать программу по умножению двух матриц, но матрицы необходимо считывать из файла (INPUT.txt).

import java.io.*;

public class Task6 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])))) {

            String[] sizes = reader.readLine().split(" ");
            int size1 = Integer.parseInt(sizes[0]);
            int size2 = Integer.parseInt(sizes[1]);
            String[][] array1 = new String[size1][size2];
            String[][] array2 = new String[size1][size2];
            int[][] newArray = new int[size1][size2];
            boolean isFull = false;

            reader.readLine();          // cбрасываю первую пустую строку

            while (!isFull) {           // заполняю первую матрицу
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = reader.readLine().split(" ");
                    isFull = true;
                }
            }
            reader.readLine();          // cбрасываю вторую пустую строку
            isFull = false;

            while (!isFull) {           // заполняю вторую матрицу
                for (int i = 0; i < array2.length; i++) {
                    array2[i] = reader.readLine().split(" ");
                    isFull = true;
                }
            }

            for (int i = 0; i < newArray.length; i++) {         // перемножаю матрицы
                for (int j = 0; j < newArray[i].length; j++) {
                    newArray[i][j] = Integer.parseInt(array1[i][j]) * Integer.parseInt(array2[i][j]);
                }
            }

            System.out.println("Перемноженная матрица:");
            printArray(newArray);

        } catch (IOException e) {
            e.printStackTrace();
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
