package by.it_academy.hw.hw4;

public class CarBMW extends Car {
    private Label label;

    public CarBMW(Label label, Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        super(color, year, wheelSize, engineCapacity);
        this.label = Label.BMW;
    }

    public Label getLabel() {
        return label;
    }
}
