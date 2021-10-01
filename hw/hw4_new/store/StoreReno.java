package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.cars.Reno;
import by.it_academy.hw.hw4_new.enums.*;

public class StoreReno extends Store<Reno> {
    @Override
    public Reno makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize) {
        return factoryReno.createCar(color, year, wheelSize, capacity, "yes");
    }

    @Override
    public Reno searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        return factoryReno.searchInStorage(color, year, wheelSize, engineCapacity);
    }
}
