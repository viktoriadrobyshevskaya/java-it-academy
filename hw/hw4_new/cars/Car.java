package by.it_academy.hw.hw4_new.cars;

import by.it_academy.hw.hw4_new.enums.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    public Color color;
    private int year;
    public WheelSize wheelSize;
    private Capacity engineCapacity;
    public List<Option> options;

    public Car(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        this.color = color;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;
        this.options = new ArrayList<>();
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

    public WheelSize getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(WheelSize wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Capacity getEngineCapacity() {
        return engineCapacity;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public void removeOption(Option option) {
        options.remove(option);
    }


    @Override
    public String toString() {
        return "Car " +
                "color=" + color.getValue() +
                ", year=" + year +
                ", wheelSize=" + wheelSize.getValue() +
                ", engineCapacity=" + engineCapacity.getValue() +
                ", options=" + options;
    }
}
