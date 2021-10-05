package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.*;

public interface SearchInStorage<T> {
    public <S> T searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, S type);
}
