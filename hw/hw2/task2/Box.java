package by.it_academy.hw.hw2.task2;

/*
    Задача 2:
    Задача с классом Box. Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
    1) Куб (Все стороны равны).
    2) Обычная коробка.
    3) Конверт (Есть только длинна и ширина).
 */
public class Box {
    private int x;
    private int y;
    private int z;
    private TypeOfShape typeOfShape;

    public Box(int x) {
        this.x = x;
        this.y = x;
        this.z = x;
        typeOfShape = TypeOfShape.CUBE;
    }

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
        typeOfShape = TypeOfShape.ENVELOPE;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        typeOfShape = TypeOfShape.BOX;
    }

    public int volume() {
        return x * y * z;
    }

    public void printInfo() {
        System.out.print("Коробка типа - \"" + typeOfShape.getValue() + "\", со сторонами: х = " + x + ", у = " + y);
        if (z != 0) {
            System.out.println(", z = " + z);
        }
    }
}
