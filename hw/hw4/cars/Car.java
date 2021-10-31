package by.it_academy.hw.hw4.cars;

import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;

import java.util.Set;

public abstract class Car<T extends AbleToChangeOptions, U extends AbleToChangeColor, V extends AbleToChangeWheels, W> {
    private Label label;
    private int year;
    private Capacity engineCapacity;

    public Car(Label label, int year, Capacity engineCapacity) {
        this.label = label;
        this.year = year;
        this.engineCapacity = engineCapacity;
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

    public abstract void setColor(U color);

    public abstract void setWheelSize(V wheelSize);

    public abstract V getWheelSize();

    public abstract U getColor();
    public abstract W getModel();

    public abstract void setOptions(Set<T> option);

    public abstract void addOption(T option);

    public abstract void removeOption(T option);

    @Override
    public String toString() {
        return " Лэйбл: " + label + " Год выпуска: " + year + " Объем двигателя: " + engineCapacity + " ";
    }
}
