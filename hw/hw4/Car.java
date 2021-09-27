package by.it_academy.hw.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private Color color;
    private int year;
    private WheelSize wheelSize;
    private Capacity engineCapacity;
    public List<Option> list;

    public Car(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        this.color = color;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.list = new ArrayList<>();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Capacity getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Capacity engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public List<Option> getList() {
        return list;
    }

    public void setList(List<Option> list) {
        this.list = list;
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
        return year == car.year && color == car.color && wheelSize == car.wheelSize && engineCapacity == car.engineCapacity && list.equals(car.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, year, wheelSize, engineCapacity, list);
    }

    @Override
    public String toString() {
        return "Автомобиль {" +
                "цвет: " + color.getValue() +
                ", год выпуска: " + year +
                ", размер колес: " + wheelSize.getValue() +
                ", объем двигателя: " + engineCapacity.getValue() +
                '}';
    }
}
