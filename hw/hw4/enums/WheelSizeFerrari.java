package by.it_academy.hw.hw4.enums;

import by.it_academy.hw.hw4.interfaces.AbleToChangeWheels;

public enum WheelSizeFerrari implements AbleToChangeWheels {
    R17("R17"),
    R18("R18"),
    R19("R19");

    private String size;

    private WheelSizeFerrari(String size) {
        this.size = size;
    }

    public String getWheelSize() {
        return size;
    }
}
