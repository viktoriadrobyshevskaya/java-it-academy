package by.it_academy.hw.hw2.task4;

/*
    Задача 4:
    Необходимо реализовать класс Car, который имеет поля марка и цвет.
    Марки имеют следующие цвета:
    Audi - Синий. Красный. Зеленый
    BMW - Оранжевый. Черный. Фиолетовый
    KIA - Желтый. Серый. Белый
    Ожидается метод, который изменяет цвет. Как параметр принимает строку, если цвет не верный, то ничего не изменяет.
 */
public class Car {
    private Label label;
    private Color color;

    public Car(Label label, Color color) {
        this.label = label;
        this.color = color;
    }

    public void setColor(String newColor) {
        for (Color col : label.getColors()) {
            if (col.getValue().equalsIgnoreCase(newColor)) {
                color = col;
            }
        }
    }

    @Override
    public String toString() {
        return "Машина - " + "марка: " + label.getValue() + ", цвет: " + color.getValue();
    }
}