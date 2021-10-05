package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.Spoiler;
import by.it_academy.hw.hw4_new.cars.Ferrari;
import by.it_academy.hw.hw4_new.enums.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryFerrari extends Factory<Ferrari> implements CreateCar<Ferrari>, SearchInStorage<Ferrari> {
    private final List<Ferrari> storage;

    public FactoryFerrari() {
        storage = new ArrayList<>();
        storage.add(new Ferrari(Color.GREY, 2021, WheelSize.SMALL, Capacity.MEDIUM, Spoiler.BACK));
        storage.add(new Ferrari(Color.GREEN, 2020, WheelSize.MEDIUM, Capacity.SMALL, Spoiler.BACK));
        storage.add(new Ferrari(Color.RED, 2019, WheelSize.SMALL, Capacity.LARGE, Spoiler.FRONT));
    }

    @Override
    public <Spoiler> Ferrari createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, Spoiler spoiler) {
        System.out.println("Машина создана: ");
        return new Ferrari(color, year, wheelSize, engineCapacity, (by.it_academy.hw.hw4_new.enums.Spoiler) spoiler);
    }

    @Override
    public <Spoiler> Ferrari searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, Spoiler spoiler) {
        for (Ferrari car : storage) {
            if (car.getYear() == year && car.getEngineCapacity().equals(engineCapacity) && car.getSpoiler().equals(spoiler)) {
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

    @Override
    public Ferrari addOption(Ferrari car, Option option) {
        optionService.addOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }

    public Ferrari removeOption(Ferrari car, Option option) {
        optionService.removeOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }
}
