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
public class Main {
    public static void main(String[] args) {
        Car audi = new Car(Label.AUDI, Color.GREEN);
        System.out.println(audi);

        audi.setColor("красный");      // поменяет цвет
        System.out.println(audi);

        audi.setColor("оранжевый");      // не поменяет цвет
        System.out.println(audi);
    }
}
