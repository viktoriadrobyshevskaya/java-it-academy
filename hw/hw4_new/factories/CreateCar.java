package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.*;

public interface CreateCar<T> {
    public <S> T createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, S type);
}
