package by.it_academy.hw.hw4_new.servises;

import by.it_academy.hw.hw4_new.cars.Car;
import by.it_academy.hw.hw4_new.enums.WheelSize;

public class WheelService implements Service<WheelSize> {
    @Override
    public Car changeCar(Car car, WheelSize wheelSize) {
        car.setWheelSize(wheelSize);
        return car;
    }
}
