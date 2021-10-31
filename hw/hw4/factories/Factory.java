package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.Car;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;
import by.it_academy.hw.hw4.servises.*;

import java.util.*;

public abstract class Factory<T> {
    Storage storage;

    ServiceWheelSize serviceWheelSize = new ServiceWheelSize();
    ServiceColor serviceColor = new ServiceColor();
    ServiceOption serviceOption = new ServiceOption();

    List<T> modelList;
    List<Capacity> capacityList;
    List<AbleToChangeColor> colorList;
    List<AbleToChangeWheels> sizeList;
    List<AbleToChangeOptions> optionsList;

    public Factory() {
        capacityList = new ArrayList<>();
        capacityList.addAll(Arrays.asList(Capacity.values()));
        colorList = new ArrayList<>();
        sizeList = new ArrayList<>();
        optionsList = new ArrayList<>();
        modelList = new ArrayList<>();
    }

    public Storage getStorage() {
        return storage;
    }

    public List<Car> getCarsFromStorage() {
        return storage.getStorage();
    }

    public abstract void printCapacity();

    public abstract void printModels();

    public abstract void printColors();

    public abstract void printSizes();

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
