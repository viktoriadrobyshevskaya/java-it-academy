package by.it_academy.hw.hw4;

public enum Label {
    NISAN("НИСАН"),
    BMW("БМВ"),
    RENO("РЕНО");

    private String value;

    private Label(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

