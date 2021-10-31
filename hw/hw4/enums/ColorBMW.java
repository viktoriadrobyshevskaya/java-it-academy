package by.it_academy.hw.hw4.enums;

import by.it_academy.hw.hw4.interfaces.AbleToChangeColor;

public enum ColorBMW implements AbleToChangeColor {
    RED("красный"),
    GREEN("зеленый"),
    WHITE("белый");

    private String color;

    private ColorBMW(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
