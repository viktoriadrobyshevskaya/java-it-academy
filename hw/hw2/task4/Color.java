package by.it_academy.hw.hw2.task4;

public enum Color {
    BLUE("синий"),
    RED("красный"),
    GREEN("зеленый"),
    ORANGE("оранжевый"),
    BLACK("черный"),
    PURPLE("фиолетовый"),
    YELLOW("желтый"),
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
