package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.*;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FactoryFerrari extends Factory<ModelFerrari> implements SearchCar<ModelFerrari, ColorFerrari, WheelSizeFerrari>, CreateCar<ModelFerrari, ColorFerrari, WheelSizeFerrari> {

    public FactoryFerrari() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ferrari(ModelFerrari.F8_SPIDER, 2019, Capacity.LARGE, ColorFerrari.BLUE, WheelSizeFerrari.R18));
        cars.add(new Ferrari(ModelFerrari.F8_SPIDER, 2021, Capacity.SMALL, ColorFerrari.ROSE, WheelSizeFerrari.R17));
        cars.add(new Ferrari(ModelFerrari.F8_TRIBUTO, 2020, Capacity.LARGE, ColorFerrari.YELLOW, WheelSizeFerrari.R18));
        this.storage = new Storage(cars);
        this.colorList.addAll(Arrays.asList(ColorBMW.values()));
        this.sizeList.addAll(Arrays.asList(WheelSizeBMW.values()));
        this.optionsList.addAll(Arrays.asList(OptionBMW.values()));
        this.modelList.addAll(Arrays.asList(ModelFerrari.values()));
    }

    @Override
    public Car createCar(Label label, ModelFerrari model, int year, Capacity capacity, ColorFerrari color, WheelSizeFerrari wheels) {
        Car car = searchInStorage(label, model, year, capacity, color, wheels);
        if (car == null) {
            System.out.println("Cоздана новая машина:");
            car = new Ferrari(model, year, capacity, color, wheels);
        }
        return car;
    }

    @Override
    public Car searchInStorage(Label label, ModelFerrari model, int year, Capacity capacity, ColorFerrari color, WheelSizeFerrari wheels) {
        for (Car car : storage.getStorage()) {
            boolean isSame = car.getLabel().equals(label) && car.getModel().equals(model) && car.getYear() == year && car.getEngineCapacity().equals(capacity);
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
        System.out.println("Список возможных цветов Ferrari: ");
        for (AbleToChangeColor color : colorList) {
            System.out.println(color);
        }
    }

    public void printSizes() {
        System.out.println("Список возможных размеров колес Ferrari: ");
        for (AbleToChangeWheels size : sizeList) {
            System.out.println(size);
        }
    }

    public void printCapacity() {
        System.out.println("Список возможных объемов двигателей Ferrari: ");
        for (Capacity capacity : capacityList) {
            System.out.println(capacity);
        }
    }

    public void printModels() {
        System.out.println("Список возможных моделей Ferrari: ");
        for (ModelFerrari modelFerrari : modelList) {
            System.out.println(modelFerrari);
        }
    }
}
