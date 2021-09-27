package by.it_academy.hw.hw3;

public enum Color {
    RED("красный"),
    GREEN("зеленый"),
    GREY("серый"),
    WHITE("белый");

    private String value;

    private Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
