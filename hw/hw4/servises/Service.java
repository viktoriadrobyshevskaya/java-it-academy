package by.it_academy.hw.hw4.servises;

import by.it_academy.hw.hw4.cars.Car;

public interface Service<T> {
    public void changeCar(Car car, T o);
}
