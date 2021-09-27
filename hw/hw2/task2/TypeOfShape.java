package by.it_academy.hw.hw2.task2;
/*
    Задача 2:
    Задача с классом Box. Необходимо добавить в класс возможность определить какого типа коробка у нас создана.
    1) Куб (Все стороны равны).
    2) Обычная коробка.
    3) Конверт (Есть только длинна и ширина).
 */
public enum TypeOfShape {
    CUBE("Куб"),
    BOX("Обычная коробка"),
    ENVELOPE("Конверт");

    private String value;

    private TypeOfShape(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
