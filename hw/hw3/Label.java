package by.it_academy.hw.hw3;

public enum Label {
    LAGUNA("ЛАГУНА"),
    DUSTER("ДАСТЕР"),
    STEPWAY("СТЭПВЭЙ");

    private String value;

    private Label(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
