package by.it_academy.hw.hw4_new.enums;

public enum Spoiler {
    BACK("задний"),
    FRONT("передний");

    private String value;

    private Spoiler(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
