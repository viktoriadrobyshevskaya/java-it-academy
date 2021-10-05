package by.it_academy.hw.hw4_new.cars;

import by.it_academy.hw.hw4_new.enums.SpareWheel;
import by.it_academy.hw.hw4_new.enums.*;

import java.util.Objects;

public class BMW extends Car {
    private Label label;
    private SpareWheel spareWheel;


    public BMW(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, SpareWheel spareWheel) {
        super(color, year, wheelSize, engineCapacity);
        this.spareWheel = spareWheel;
        this.label = Label.BMW;
    }

    public Label getLabel() {
        return label;
    }

    public SpareWheel getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(SpareWheel spareWheel) {
        this.spareWheel = spareWheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BMW bmw = (BMW) o;
        return label == bmw.label && Objects.equals(spareWheel, bmw.spareWheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, spareWheel);
    }

    @Override
    public String toString() {
        return "BMW [" +
                "label=" + label +
                ", spareWheel=" + spareWheel +
                super.toString() + "]";
    }
}
