package by.it_academy.hw.hw4.enums;

import by.it_academy.hw.hw4.interfaces.AbleToChangeOptions;

public enum OptionReno implements AbleToChangeOptions {
    MASSAGE_SEAT("кресло с массажем"),
    PARKTRONIC("парктроник");

    private String option;

    private OptionReno(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
