package by.it_academy.hw.hw4_new.servises;

import by.it_academy.hw.hw4_new.cars.Car;

public interface Service<T> {
    public Car changeCar(Car car, T o);
}
