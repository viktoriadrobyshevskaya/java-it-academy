package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.*;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;

public interface CreateCar<T, S extends AbleToChangeColor, U extends AbleToChangeWheels> {
    public Car createCar(Label label, T model, int year, Capacity capacity, S color, U wheels);

}
