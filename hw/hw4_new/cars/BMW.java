package by.it_academy.hw.hw4_new.cars;

import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.Label;
import by.it_academy.hw.hw4_new.enums.WheelSize;

import java.util.Objects;

public class BMW extends Car{
    private Label label;
    private String spareWheel;

    public BMW(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String spareWheel) {
        super(color, year, wheelSize, engineCapacity);
        this.spareWheel = spareWheel;
        this.label = Label.BMW;
    }

    public Label getLabel() {
        return label;
    }

    public String getSpareWheel() {
        return spareWheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BMW bmw = (BMW) o;
        return label == bmw.label && Objects.equals(spareWheel, bmw.spareWheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label, spareWheel);
    }

    @Override
    public String toString() {
        return "BMW " +
                super.toString() +
                ", label=" + label +
                ", spareWheel=" + spareWheel;
    }
}
