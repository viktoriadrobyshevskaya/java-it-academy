package by.it_academy.hw.hw4_new.cars;

import by.it_academy.hw.hw4_new.enums.Trunk;
import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.Label;
import by.it_academy.hw.hw4_new.enums.WheelSize;

import java.util.Objects;

public class Reno extends Car {
    private Label label;
    private Trunk trunk;

    public Reno(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, Trunk trunk) {
        super(color, year, wheelSize, engineCapacity);
        this.label = Label.RENO;
        this.trunk = trunk;
    }

    public Label getLabel() {
        return label;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reno reno = (Reno) o;
        return label == reno.label && Objects.equals(trunk, reno.trunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, trunk);
    }

    @Override
    public String toString() {
        return "Reno [" +
                "label=" + label +
                ", trunk=" + trunk +
                super.toString() + "]";
    }
}
