package by.it_academy.hw.hw4.store;

import by.it_academy.hw.hw4.cars.Car;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.factories.*;
import by.it_academy.hw.hw4.interfaces.*;
import by.it_academy.hw.hw4.servises.*;

import java.util.Set;

public class Store {
    FactoryFerrari factoryFerrari = new FactoryFerrari();
    FactoryReno factoryReno = new FactoryReno();
    FactoryBMW factoryBMW = new FactoryBMW();

    ServiceColor serviceColor = new ServiceColor();
    ServiceWheelSize serviceWheelSize = new ServiceWheelSize();
    ServiceOption serviceOption = new ServiceOption();

    public <T> Car createOrder(Label label, T model, int year, Capacity capacity, AbleToChangeColor color, AbleToChangeWheels wheels) {
        try {
            if (label == Label.BMW && color instanceof ColorBMW && wheels instanceof WheelSizeBMW) {
                return factoryBMW.createCar(label, (ModelBMW) model, year, capacity, (ColorBMW) color, (WheelSizeBMW) wheels);
            } else if (label == Label.RENO && color instanceof ColorReno && wheels instanceof WheelSizeReno) {
                return factoryReno.createCar(label, (ModelReno) model, year, capacity, (ColorReno) color, (WheelSizeReno) wheels);
            } else if (label == Label.FERRARI && color instanceof ColorFerrari && wheels instanceof WheelSizeFerrari) {
                return factoryFerrari.createCar(label, (ModelFerrari) model, year, capacity, (ColorFerrari) color, (WheelSizeFerrari) wheels);
            }
        } catch (ClassCastException e) {
            System.out.println("Вы ввели неверные параметры. Машина не создана.");
        }
        System.out.println("Вы ввели неверные параметры. Машина не создана.");
        return null;
    }

    public Car changeColorCar(Car car, AbleToChangeColor color) {
        serviceColor.changeCar(car, color);
        return car;
    }

    public Car changeCarWheelSize(Car car, AbleToChangeWheels wheels) {
        serviceWheelSize.changeCar(car, wheels);
        return car;
    }

    public <T extends AbleToChangeOptions> Car setNewOptionsInCar(Car car, Set<T> options) {
        serviceOption.setNewListOptions(car, options);
        return car;
    }

    public Car addNewOptionInCar(Car car, AbleToChangeOptions option) {
        serviceOption.changeCar(car, option);
        return car;
    }

    public Car removeOptionInCar(Car car, AbleToChangeOptions option) {
        serviceOption.removeOption(car, option);
        return car;
    }

}
