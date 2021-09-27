package by.it_academy.hw.hw1;

/*
    N студентов стоят в очереди за стипендией. Каждый студент имеет учебный рейтинг.
    Деканат должен выдать стипендию таким образом, чтобы: каждый студент получил хотя бы 1 рубль, студенты с более
    высоким рейтингом получили больше рублей, чем их соседи в очереди. Копеек в деканате нет. Какое минимальное
    количество рублей должно быть у деканата? На вход подаётся массив из N элементов, содержащий рейтинги для
    каждого студента. На выходе ожидается число, обозначающее минимальное количество рублей, которых должно хватить студентам.
    Пример:
    Вход: [1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2]
    Выход: 47
 */

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int[] rubles = new int[grades.length];

        rubles[0] = 1;
        for (int i = 1; i < grades.length; i++) {
            rubles[i] = 1;
            if (grades[i] > grades[i - 1]) {
                rubles[i] = rubles[i - 1] + 1;
            }
            if (rubles[i] == rubles[i - 1] && grades[i] < grades[i - 1]) {
                rubles[i - 1] += 1;
            }
        }

        for (int i = grades.length - 1; i > 0; i--) {
            if (rubles[i] == rubles[i - 1] && grades[i - 1] > grades[i]) {
                rubles[i - 1] += 1;
            }
        }

        int sum = 0;
        for (int x : rubles) {
            sum = sum + x;
        }

        System.out.println(Arrays.toString(grades));
        System.out.print(Arrays.toString(rubles));
        System.out.println(" = " + sum);
    }
}
