package by.it_academy.hw.hw4.enums;

import by.it_academy.hw.hw4.interfaces.AbleToChangeColor;

public enum ColorReno implements AbleToChangeColor {
    GREY("серый"),
    GOLD("золотой"),
    BLACK("черный");

    private String color;

    private ColorReno(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
