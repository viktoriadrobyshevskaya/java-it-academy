package by.it_academy.hw.hw2.task1;
/*
    Задача 1:
    Задача с месяцами года.

    Необходимо реализовaть класс, который имеет два метода:
    1) определить номер месяца по имени.
    2) определить имя месяца по номеру.
 */

public enum Month {
    JANUARY(1, "январь"),
    FEBRUARY(2, "февраль"),
    MARCH(3, "март"),
    APRIL(4, "апрель"),
    MAY(5, "май"),
    JUNE(6, "июнь"),
    JULY(7, "июль"),
    AUGUST(8, "август"),
    SEPTEMBER(9, "сентябрь"),
    OCTOBER(10, "октябрь"),
    NOVEMBER(11, "ноябрь"),
    DECEMBER(12, "декабрь");

    private int number;
    private String name;

    private Month(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static void nameByNumber(int number) {
        Month[] months = Month.values();
        for (Month m : months) {
            if (number == m.getNumber()) {
                System.out.println("Месяц номер " + number + " - " + m.getName());
            }
        }
    }

    public static void numberByName(String name) {
        Month[] months = Month.values();
        for (Month m : months) {
            if (name.equalsIgnoreCase(m.getName())) {
                System.out.println("Номер месяца " + name + " - " + m.getNumber());
            }
        }
    }
}
