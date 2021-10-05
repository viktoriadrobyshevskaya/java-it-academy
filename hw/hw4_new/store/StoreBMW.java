package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.cars.BMW;
import by.it_academy.hw.hw4_new.enums.*;
import by.it_academy.hw.hw4_new.factories.SearchInStorage;

public class StoreBMW extends Store<BMW> implements SearchInStorage<BMW> {

    @Override
    public <S> BMW makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize, S spareWheel) {
        BMW car = searchInStorage(color, year, wheelSize, capacity, spareWheel);
        if (car == null) {
            return factoryBMW.createCar(color, year, wheelSize, capacity, spareWheel);
        }
        return car;
    }

    @Override
    public <S> BMW searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, S spareWheel) {
        return factoryBMW.searchInStorage(color, year, wheelSize, engineCapacity, spareWheel);
    }
}
