package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.cars.BMW;
import by.it_academy.hw.hw4_new.enums.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryBMW extends Factory<BMW> {
    private final List<BMW> storage;

    public FactoryBMW() {
        storage = new ArrayList<>();
        storage.add(new BMW(Color.GREY, 2021, WheelSize.SMALL, Capacity.MEDIUM, "yes"));
        storage.add(new BMW(Color.GREEN, 2020, WheelSize.MEDIUM, Capacity.SMALL, "yes"));
        storage.add(new BMW(Color.RED, 2019, WheelSize.SMALL, Capacity.LARGE, "yes"));
    }

    @Override
    public BMW createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String spareWheel) {
        System.out.println("Машина создана: ");
        return new BMW(color, year, wheelSize, engineCapacity, spareWheel);
    }

    @Override
    public BMW searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        for (BMW car : storage) {
            if (car.getYear() == year && car.getEngineCapacity().equals(engineCapacity)) {
                System.out.println("Машина найдена в хранилище: " + car);
                colorService.changeCar(car, color);
                wheelService.changeCar(car, wheelSize);
                System.out.println("Машина изменена по заказу:");
                return car;
            }
        }
        System.out.print("В хранилище подходящей машины не найдено. ");
        return null;
    }

    public BMW addOption(BMW car, Option option) {
        optionService.addOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }

    public BMW removeOption(BMW car, Option option) {
        optionService.removeOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }
}
