package by.it_academy.hw.hw2.task3;

import java.util.Arrays;

/*
    Задача 3:
    Необходимо создать класс, который имеет метод, чтобы накапливать 5 последних переданных
    в него цифровых значений. Так же необходимо создать метод, который выводит
    среднее из накопленных значений.
 */
public class Main {
    public static void main(String[] args) {
        Keeper keeper = new Keeper();

        keeper.addNumbers(5);
        keeper.addNumbers(8);
        keeper.addNumbers(9);
        keeper.addNumbers(5);
        keeper.addNumbers(10);
        keeper.addNumbers(6);
        keeper.addNumbers(4);
        keeper.addNumbers(1);
        keeper.addNumbers(1);

        keeper.averageValue();
    }
}
