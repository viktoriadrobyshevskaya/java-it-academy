package by.it_academy.hw.hw1;

/*
    Задание 1
    Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
    "n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
    встречается число "n" то в сумму его включать не нужно.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] array = {2, 7, 6, 1, 2, 4, 5};
        int number = 6;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                sum += array[i];
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
