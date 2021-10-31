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
            if (label == Label.BMW) {
                return factoryBMW.createCar(label, (ModelBMW) model, year, capacity, (ColorBMW) color, (WheelSizeBMW) wheels);
            } else if (label == Label.RENO) {
                return factoryReno.createCar(label, (ModelReno) model, year, capacity, (ColorReno) color, (WheelSizeReno) wheels);
            } else if (label == Label.FERRARI) {
                return factoryFerrari.createCar(label, (ModelFerrari) model, year, capacity, (ColorFerrari) color, (WheelSizeFerrari) wheels);
            }
        } catch (ClassCastException e) {
            System.out.print("Машина не создана. ");
        }
        System.out.println("Вы ввели неверные параметры.");
        return null;
    }

    public void changeColorCar(Car car, AbleToChangeColor color) {
        serviceColor.changeCar(car, color);
    }

    public void changeCarWheelSize(Car car, AbleToChangeWheels wheels) {
        serviceWheelSize.changeCar(car, wheels);
    }

    public <T extends AbleToChangeOptions> void setNewOptionsInCar(Car car, Set<T> options) {
        serviceOption.setNewListOptions(car, options);
    }

    public void addNewOptionInCar(Car car, AbleToChangeOptions option) {
        serviceOption.changeCar(car, option);
    }

    public void removeOptionInCar(Car car, AbleToChangeOptions option) {
        serviceOption.removeOption(car, option);
    }
}
