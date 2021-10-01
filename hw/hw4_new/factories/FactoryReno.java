package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.cars.Reno;
import by.it_academy.hw.hw4_new.enums.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryReno extends Factory<Reno> {
    private List<Reno> storage;

    public FactoryReno() {
        storage = new ArrayList<>();
        storage.add(new Reno(Color.GREY, 2021, WheelSize.SMALL, Capacity.MEDIUM, "yes"));
        storage.add(new Reno(Color.GREEN, 2020, WheelSize.MEDIUM, Capacity.SMALL, "yes"));
        storage.add(new Reno(Color.RED, 2019, WheelSize.SMALL, Capacity.LARGE, "yes"));
    }

    @Override
    public Reno createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String spareWheel) {
        System.out.println("Машина создана: ");
        return new Reno(color, year, wheelSize, engineCapacity, spareWheel);
    }

    @Override
    public Reno searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        for (Reno car : storage) {
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

    public Reno addOption(Reno car, Option option) {
        optionService.addOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }

    public Reno removeOption(Reno car, Option option) {
        optionService.removeOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }
}
