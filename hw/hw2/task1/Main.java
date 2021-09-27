package by.it_academy.hw.hw2.task1;
/*
    Задача 1:
    Задача с месяцами года.

    Необходимо реализовaть класс, который имеет два метода:
    1) определить номер месяца по имени.
    2) определить имя месяца по номеру.
 */

public class Main {
    public static void main(String[] args) {
        Month.numberByName("декабрь");
        Month.nameByNumber(10);
    }
}