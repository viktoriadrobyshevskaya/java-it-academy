package by.it_academy.hw.hw4_new.cars;

import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.Label;
import by.it_academy.hw.hw4_new.enums.WheelSize;

import java.util.Objects;

public class Ferrari extends Car{
    private Label label;
    private String spoiler;

    public Ferrari(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String spoiler) {
        super(color, year, wheelSize, engineCapacity);
        this.label = Label.FERRARI;
        this.spoiler = spoiler;
    }

    public Label getLabel() {
        return label;
    }

    public String getSpoiler() {
        return spoiler;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ferrari ferrari = (Ferrari) o;
        return label == ferrari.label && Objects.equals(spoiler, ferrari.spoiler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label, spoiler);
    }

    @Override
    public String toString() {
        return "Ferrari " +
                super.toString() +
                ", label=" + label +
                ", spoiler=" + spoiler;
    }
}
