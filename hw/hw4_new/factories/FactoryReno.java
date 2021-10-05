package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.Trunk;
import by.it_academy.hw.hw4_new.cars.Reno;
import by.it_academy.hw.hw4_new.enums.*;

import java.util.ArrayList;
import java.util.List;

public class FactoryReno extends Factory<Reno> implements CreateCar<Reno>, SearchInStorage<Reno> {
    private List<Reno> storage;

    public FactoryReno() {
        storage = new ArrayList<>();
        storage.add(new Reno(Color.GREY, 2021, WheelSize.SMALL, Capacity.MEDIUM, Trunk.SMALL));
        storage.add(new Reno(Color.GREEN, 2020, WheelSize.MEDIUM, Capacity.SMALL, Trunk.SMALL));
        storage.add(new Reno(Color.RED, 2019, WheelSize.SMALL, Capacity.LARGE, Trunk.LARGE));
    }

    @Override
    public <Trunk> Reno createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, Trunk trunk) {
        System.out.println("Создана новая машина: ");
        return new Reno(color, year, wheelSize, engineCapacity, (by.it_academy.hw.hw4_new.enums.Trunk) trunk);
    }


    @Override
    public <Trunk> Reno searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, Trunk trunk) {
        for (Reno car : storage) {
            if (car.getYear() == year && car.getEngineCapacity().equals(engineCapacity) && car.getTrunk().equals(trunk)) {
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
