package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.WheelSize;

public interface SearchInStorage<T> {
    public T searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity);
}
