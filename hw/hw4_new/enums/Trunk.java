package by.it_academy.hw.hw4_new.enums;

public enum Trunk {
    SMALL(300),
    MEDIUM(450),
    LARGE(700);

    private double value;

    private Trunk(int value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
