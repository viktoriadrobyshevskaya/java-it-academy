package by.it_academy.hw.hw1;
/*
    Задание 2
    Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до определенного индекса "n".
    Например:
    Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
    n = 7
    Сумма всех четных до 7го.  равна 2 + 8 = 10.
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 10;

        int firstNum = 0;
        int secondNum = 1;
        int nextNum = firstNum + secondNum;

        int sum = 0;
        for (int i = 3; i < n; i++) {
            int tmp = nextNum;
            nextNum = secondNum + nextNum;
            secondNum = tmp;

            if (nextNum % 2 == 0) {
                sum += nextNum;
            }
        }
        System.out.print(String.format("Сумма четных чисел последовательности Фибоначи до %d элемента: %d", n, sum));
    }
}