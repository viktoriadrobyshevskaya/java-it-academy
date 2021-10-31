package by.it_academy.hw.hw4.enums;

import by.it_academy.hw.hw4.interfaces.AbleToChangeWheels;

public enum WheelSizeReno implements AbleToChangeWheels {
    R15("R15"),
    R16("R16"),
    R17("R17");

    private String size;

    private WheelSizeReno(String size) {
        this.size = size;
    }

    public String getWheelSize() {
        return size;
    }
}
