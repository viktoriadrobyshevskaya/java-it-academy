package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.*;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;

import java.util.*;

public class FactoryBMW extends Factory<ModelBMW> implements SearchCar<ModelBMW, ColorBMW, WheelSizeBMW>, CreateCar<ModelBMW, ColorBMW, WheelSizeBMW> {

    public FactoryBMW() {
        List<Car> cars = new ArrayList<>();
        cars.add(new BMW(ModelBMW.E88, 2020, Capacity.LARGE, ColorBMW.GREEN, WheelSizeBMW.R16));
        cars.add(new BMW(ModelBMW.F20, 2021, Capacity.SMALL, ColorBMW.WHITE, WheelSizeBMW.R17));
        cars.add(new BMW(ModelBMW.E88, 2020, Capacity.LARGE, ColorBMW.RED, WheelSizeBMW.R18));
        this.storage = new Storage(cars);
        this.colorList.addAll(Arrays.asList(ColorBMW.values()));
        this.sizeList.addAll(Arrays.asList(WheelSizeBMW.values()));
        this.optionsList.addAll(Arrays.asList(OptionBMW.values()));
        this.modelList.addAll(Arrays.asList(ModelBMW.values()));
    }

    @Override
    public Car createCar(Label label, ModelBMW model, int year, Capacity capacity, ColorBMW color, WheelSizeBMW wheels) {
        Car car = searchInStorage(label, model, year, capacity, color, wheels);
        if (car == null) {
            System.out.println("Cоздана новая машина:");
            car = new BMW(model, year, capacity, color, wheels);
        }
        return car;
    }

    @Override
    public Car searchInStorage(Label label, ModelBMW modelBMW, int year, Capacity capacity, ColorBMW color, WheelSizeBMW wheels) {
       for (Car car : storage.getStorage()) {
            boolean isSame = car.getLabel().equals(label) && car.getModel().equals(modelBMW) && car.getYear() == year && car.getEngineCapacity().equals(capacity);
            if (isSame && car.getColor().equals(color) && car.getWheelSize().equals(wheels)) {
                Car tmp = car;
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (isSame && car.getColor().equals(color)) {
                Car tmp = car;
                serviceWheelSize.changeCar(tmp, wheels);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (isSame && car.getWheelSize().equals(wheels)) {
                Car tmp = car;
                serviceColor.changeCar(tmp, color);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (isSame) {
                Car tmp = car;
                serviceColor.changeCar(tmp, color);
                serviceWheelSize.changeCar(tmp, wheels);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            }
        }
        System.out.println("В хранилище ничего не найдено.");
        return null;
    }

    public void printColors() {
        System.out.println("Список возможных цветов BMW: ");
        for (AbleToChangeColor color : colorList) {
            System.out.println(color);
        }
    }

    public void printSizes() {
        System.out.println("Список возможных размеров колес BMW: ");
        for (AbleToChangeWheels size : sizeList) {
            System.out.println(size);
        }
    }

    public void printCapacity() {
        System.out.println("Список возможных объемов двигателей BMW: ");
        for (Capacity capacity : capacityList) {
            System.out.println(capacity);
        }
    }

    public void printModels() {
        System.out.println("Список возможных моделей BMW: ");
        for (ModelBMW model : modelList) {
            System.out.println(model);
        }
    }
}
