package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.cars.Reno;
import by.it_academy.hw.hw4_new.enums.*;
import by.it_academy.hw.hw4_new.factories.SearchInStorage;

public class StoreReno extends Store<Reno> implements SearchInStorage<Reno> {

    @Override
    public <S> Reno makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize, S trunk) {
        Reno car = searchInStorage(color, year, wheelSize, capacity, trunk);
        if (car == null){
            return factoryReno.createCar(color, year, wheelSize, capacity, trunk);
        }
        return car;
    }

    @Override
    public <S> Reno searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, S trunk) {
        return factoryReno.searchInStorage(color, year, wheelSize, engineCapacity, trunk);
    }
}
