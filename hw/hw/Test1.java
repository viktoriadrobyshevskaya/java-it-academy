package by.it_academy.hw.hw;

public class Test1 {
    public static void main(String[] args) {
        int day = 28;
        int month = 2;
        int year = 2020;

        int dayInMonth; // переменная для определения сколько дней в месяце

        switch (month) {
            case 1:
                dayInMonth = 31;
                break;
            case 2:
                dayInMonth = 28;
                break;
            case 3:
                dayInMonth = 31;
                break;
            case 4:
                dayInMonth = 30;
                break;
            case 5:
                dayInMonth = 31;
                break;
            case 6:
                dayInMonth = 30;
                break;
            case 7:
                dayInMonth = 31;
                break;
            case 8:
                dayInMonth = 31;
                break;
            case 9:
                dayInMonth = 30;
                break;
            case 10:
                dayInMonth = 31;
                break;
            case 11:
                dayInMonth = 30;
                break;
            case 12:
                dayInMonth = 31;
                break;
            default:
                dayInMonth = -1;
        }

        boolean isCorrect = day > 0 && month > 0 && year > 0; // проверяет, чтобы не было введено отрицательных чисел
        int nextDay;

        if (isCorrect) {
            nextDay = day + 1;
            if (day == dayInMonth) { // проверяет, равен ли день максимальному кол-ву дней в месяце
                nextDay = 1;
                month = month + 1;
                if (month > 12) {
                    month = 1;
                    year = year + 1;
                }
                System.out.println(nextDay + "." + month + "." + year);
            } else if (day < dayInMonth) {
                System.out.println(nextDay + "." + month + "." + year);
            } else {
                System.out.println("Некорректные данные");
            }
        } else {
            System.out.println("Некорректные данные");
        }
    }
}
