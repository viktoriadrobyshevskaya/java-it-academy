package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.cars.Ferrari;
import by.it_academy.hw.hw4_new.enums.*;

public class StoreFerrari extends Store<Ferrari> {
    @Override
    public Ferrari makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize) {
        return factoryFerrari.createCar(color, year, wheelSize, capacity, "yes");
    }

    @Override
    public Ferrari searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        return factoryFerrari.searchInStorage(color, year, wheelSize, engineCapacity);
    }
}
