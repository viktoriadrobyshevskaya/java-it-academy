package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.cars.BMW;
import by.it_academy.hw.hw4_new.enums.*;

public class StoreBMW extends Store<BMW> {

    @Override
    public BMW makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize) {
        return factoryBMW.createCar(color, year, wheelSize, capacity, "yes");
    }

    @Override
    public BMW searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity) {
        return factoryBMW.searchInStorage(color, year, wheelSize, engineCapacity);
    }
}
