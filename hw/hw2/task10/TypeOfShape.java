package by.it_academy.hw.hw2.task10;

public enum TypeOfShape {
    CUBE("Куб"),
    BOX("Обычная коробка"),
    ENVELOPE("Конверт");

    private String value;

    private TypeOfShape(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
