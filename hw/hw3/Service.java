package by.it_academy.hw.hw3;

public class Service {

    public void changeColor(Car car, Color newColor) {
        car.setColor(newColor);
    }

    public void changeWheel(Car car, WheelSize newSize) {
        car.setWheelSize(newSize);
    }

    public void addOption(Car car, Option option) {
        car.list.add(option);
    }

    public void removeOption(Car car, Option option) {
        car.list.remove(option);
    }
}
