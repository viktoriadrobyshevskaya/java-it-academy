package by.it_academy.hw.hw2.task2;

/*
    Задача 2:
    Задача с классом Box.
    Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
    1) Куб (Все стороны равны).
    2) Обычная коробка.
    3) Конверт (Есть только длинна и ширина).
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box(2, 4, 5);
        Box box2 = new Box(4);
        Box box3 = new Box(2, 5);

        box.printInfo();
        box2.printInfo();
        box3.printInfo();
    }
}
