package by.it_academy.hw.hw4_new.enums;

public enum Label {
    BMW("БМВ"),
    RENO("Рено"),
    FERRARI("Феррари");

    private String value;

    private Label(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
