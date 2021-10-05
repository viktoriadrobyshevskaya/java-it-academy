package by.it_academy.hw.hw4_new.servises;

import by.it_academy.hw.hw4_new.cars.Car;
import by.it_academy.hw.hw4_new.enums.Color;

public class ColorService implements Service<Color> {
    @Override
    public Car changeCar(Car car, Color color) {
        car.setColor(color);
        return car;
    }
}
