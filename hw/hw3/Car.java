package by.it_academy.hw.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    public Color color;
    private Label label;
    private int year;
    public WheelSize wheelSize;
    private Capacity engineCapacity;
    public List<Option> list;

    public Car(Color color, Label label, int year, WheelSize wheelSize, Capacity engineCapacity) {
        this.color = color;
        this.label = label;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.list = new ArrayList<>();
    }

    public Car(Color color, Label label, int year, WheelSize wheelSize, Capacity engineCapacity, List<Option> list) {
        this.color = color;
        this.label = label;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.list = list;
    }

    public Color getColor() {
        return color;
    }

    public Label getLabel() {
        return label;
    }

    public int getYear() {
        return year;
    }

    public Capacity getEngineCapacity() {
        return engineCapacity;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public List<Option> getList() {
        return list;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void addOption(Option option) {
        list.add(option);
    }

    public void removeOption(Option option) {
        list.remove(option);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && color == car.color && label == car.label && wheelSize == car.wheelSize && engineCapacity == car.engineCapacity && Objects.equals(list, car.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, label, year, wheelSize, engineCapacity, list);
    }

    public void printCar() {
        System.out.print("Автомобиль Reno " + "цвет: " + color.getValue() + ", марка: " + label.getValue() +
                ", год выпуска: " + year + ", размер колес: " + wheelSize.getValue() + ", объем двигателя: " + engineCapacity.getValue());
        if (this.list != null){
            System.out.println(", опции: " + list);
        }
    }
}
