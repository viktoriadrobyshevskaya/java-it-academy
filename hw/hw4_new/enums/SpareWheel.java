package by.it_academy.hw.hw4_new.enums;

public enum SpareWheel {
    FULL_SIZE("полноприводное"),
    EMERGENCY("аварийное");

    private String value;

    private SpareWheel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
