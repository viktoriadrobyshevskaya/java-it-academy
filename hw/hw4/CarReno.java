package by.it_academy.hw.hw4;

public class CarReno extends Car {
    private Label label;

    public CarReno(Label label, Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        super(color, year, wheelSize, engineCapacity);
        this.label = Label.RENO;
    }

    public Label getLabel() {
        return label;
    }
}
