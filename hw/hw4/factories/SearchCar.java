package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.Car;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;

public interface SearchCar<T, S extends AbleToChangeColor, U extends AbleToChangeWheels> {
    public Car searchInStorage(Label label, T model, int year, Capacity capacity, S color, U wheels);
}
