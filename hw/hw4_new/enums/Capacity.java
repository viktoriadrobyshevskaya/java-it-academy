package by.it_academy.hw.hw4_new.enums;

public enum Capacity {
    SMALL(1.2),
    MEDIUM(1.8),
    LARGE(3.5);

    private double value;

    private Capacity(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
