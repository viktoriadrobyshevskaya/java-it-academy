package by.it_academy.hw.hw4;

public class CarNisan extends Car {
    private Label label;

    public CarNisan(Label label, Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        super(color, year, wheelSize, engineCapacity);
        this.label = Label.NISAN;
    }

    public Label getLabel() {
        return label;
    }
}
