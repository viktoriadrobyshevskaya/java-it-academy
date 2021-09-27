package by.it_academy.hw.hw1;

/*
    Задание 5.
    Дан некоторый двумерный массив. Нужно определить является ли он нижней треугольной матрицей или же нет.
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0, 0}, {5, 8, 0, 0}, {5, 5, 8, 0}, {1, 2, 5, 2}};

        for (int i = 0; i < array.length; i++) {       // цикл, который красиво выводит матрицу (для наглядности)
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        boolean isTrue = true;
        for (int i = 0; i < array.length; i++) {     // цикл, который проверяет, что числа выше главной диагонали = 0
            for (int j = i + 1; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    continue;
                } else {
                    isTrue = false;                   // если это не так, устанавливает флаг на false
                    break;
                }
            }
        }

        if (isTrue) {                                // если флаг равен true - это нижняя треугольная матрица матрицы
            System.out.println("Данный массив является нижней треугольной матрицей.");
        } else {
            System.out.println("Данный массив не является нижней треугольной матрицей.");
        }
    }
}
