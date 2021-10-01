package by.it_academy.hw.hw4_new.servises;

import by.it_academy.hw.hw4_new.cars.Car;
import by.it_academy.hw.hw4_new.enums.Option;

import java.util.List;

public class OptionService implements Service<List<Option>> {
    @Override
    public Car changeCar(Car car, List<Option> list) {
        car.setOptions(list);
        return car;
    }

    public <T extends Car> T addOption(T car, Option option) {
        car.addOption(option);
        return car;
    }

    public <T extends Car> T removeOption(T car, Option option) {
        car.removeOption(option);
        return car;
    }
}
