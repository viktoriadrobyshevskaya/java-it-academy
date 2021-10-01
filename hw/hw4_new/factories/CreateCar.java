package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.WheelSize;

public interface CreateCar<T> {
    public T createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String spareWheel);
}
