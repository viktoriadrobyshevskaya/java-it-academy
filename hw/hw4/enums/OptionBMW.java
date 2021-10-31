package by.it_academy.hw.hw4.enums;

import by.it_academy.hw.hw4.interfaces.AbleToChangeOptions;

public enum OptionBMW implements AbleToChangeOptions {
    CONDITIONER("кондиционер"),
    CRUISECONTROL("круиз-контроль");

    private String option;

    private OptionBMW(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }
}
