package by.it_academy.hw.hw4_new.enums;

public enum WheelSize {
    SMALL(13),
    MEDIUM(14),
    LARGE(15);

    private int value;

    private WheelSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
