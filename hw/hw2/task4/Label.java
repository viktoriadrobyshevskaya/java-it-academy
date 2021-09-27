package by.it_academy.hw.hw2.task4;
/*
    Audi - Синий. Красный. Зеленый
    BMW - Оранжевый. Черный. Фиолетовый
    KIA - Желтый. Серый. Белый
 */
public enum Label {
    AUDI("Ауди", new Color[]{Color.BLUE, Color.RED, Color.GREEN}),
    BMW("БМВ", new Color[]{Color.ORANGE, Color.BLACK, Color.PURPLE}),
    KIA("КИА", new Color[]{Color.YELLOW, Color.GREY, Color.WHITE});

    private String value;
    private Color[] colors;

    private Label(String value, Color[] colors) {
        this.value = value;
        this.colors = colors;
    }

    public String getValue() {
        return value;
    }

    public Color[] getColors() {
        return colors;
    }
}
