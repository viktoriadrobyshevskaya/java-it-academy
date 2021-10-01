package by.it_academy.hw.hw4_new.cars;

import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.Label;
import by.it_academy.hw.hw4_new.enums.WheelSize;

import java.util.Objects;

public class Reno extends Car{
    private Label label;
    private String trunk;

    public Reno(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String trunk) {
        super(color, year, wheelSize, engineCapacity);
        this.label = Label.RENO;
        this.trunk = trunk;
    }

    public Label getLabel() {
        return label;
    }

    public String getTrunk() {
        return trunk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Reno reno = (Reno) o;
        return label == reno.label && Objects.equals(trunk, reno.trunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label, trunk);
    }

    @Override
    public String toString() {
        return "Reno " +
                super.toString() +
                ", label=" + label +
                ", trunk=" + trunk;
    }
}
