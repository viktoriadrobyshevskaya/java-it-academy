package by.it_academy.hw.hw4_new.store;

import by.it_academy.hw.hw4_new.enums.*;
import by.it_academy.hw.hw4_new.factories.*;

public abstract class Store<T> implements SearchInStorage<T> {
    FactoryFerrari factoryFerrari = new FactoryFerrari();
    FactoryReno factoryReno = new FactoryReno();
    FactoryBMW factoryBMW = new FactoryBMW();

    public abstract <S> T makeOrder(Color color, int year, Capacity capacity, WheelSize wheelSize, S type);

}
