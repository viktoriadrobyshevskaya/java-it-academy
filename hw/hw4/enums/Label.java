package by.it_academy.hw.hw4.enums;

public enum Label {
    BMW("БМВ"),
    RENO("Рено"),
    FERRARI("Феррари");

    private String label;

    private Label(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
