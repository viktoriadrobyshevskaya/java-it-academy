package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.cars.Ferrari;
import by.it_academy.hw.hw4_new.enums.*;
import by.it_academy.hw.hw4_new.factories.SearchInStorage;

public class StoreFerrari extends Store<Ferrari> implements SearchInStorage<Ferrari> {
    @Override
    public <S> Ferrari makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize, S spoiler) {
        Ferrari car = searchInStorage(color, year, wheelSize, capacity, spoiler);
        if (car == null) {
            return factoryFerrari.createCar(color, year, wheelSize, capacity, spoiler);
        }
        return car;
    }

    @Override
    public <S> Ferrari searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, S spoiler) {
        return factoryFerrari.searchInStorage(color, year, wheelSize, engineCapacity, spoiler);
    }
}
