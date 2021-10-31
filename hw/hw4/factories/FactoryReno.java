package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.*;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FactoryReno extends Factory<ModelReno> implements SearchCar<ModelReno, ColorReno, WheelSizeReno>, CreateCar<ModelReno, ColorReno, WheelSizeReno> {

    public FactoryReno() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Reno(ModelReno.DUSTER, 2019, Capacity.LARGE, ColorReno.BLACK, WheelSizeReno.R17, Set.of(OptionReno.MASSAGE_SEAT)));
        cars.add(new Reno(ModelReno.ARKANA, 2020, Capacity.SMALL, ColorReno.GREY, WheelSizeReno.R17, Set.of(OptionReno.PARKTRONIC)));
        cars.add(new Reno(ModelReno.ARKANA, 2020, Capacity.LARGE, ColorReno.BLACK, WheelSizeReno.R16));
        this.storage = new Storage(cars);

        this.colorList.addAll(Arrays.asList(ColorBMW.values()));
        this.sizeList.addAll(Arrays.asList(WheelSizeBMW.values()));
        this.optionsList.addAll(Arrays.asList(OptionBMW.values()));
        this.modelList.addAll(Arrays.asList(ModelReno.values()));
    }

    @Override
    public Car createCar(Label label, ModelReno modelReno, int year, Capacity capacity, ColorReno color, WheelSizeReno wheels) {
        Car car = searchInStorage(label, modelReno, year, capacity, color, wheels);
        if (car == null) {
            System.out.println("Cоздана новая машина:");
            car = new Reno(modelReno, year, capacity, color, wheels);
        }
        return car;
    }

    @Override
    public Car searchInStorage(Label label, ModelReno modelReno, int year, Capacity capacity, ColorReno color, WheelSizeReno wheels) {
        for (Car car : storage.getStorage()) {
            if (car.getLabel().equals(label) && car.getModel().equals(modelReno) && car.getYear() == year && car.getEngineCapacity().equals(capacity)
                    && car.getColor().equals(color) && car.getWheelSize().equals(wheels)) {
                Car tmp = car;
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (car.getLabel().equals(label) && car.getModel().equals(modelReno) && car.getYear() == year && car.getEngineCapacity().equals(capacity)
                    && car.getColor().equals(color)) {
                Car tmp = car;
                serviceWheelSize.changeCar(tmp, wheels);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (car.getLabel().equals(label) && car.getModel().equals(modelReno) && car.getYear() == year && car.getEngineCapacity().equals(capacity)
                    && car.getWheelSize().equals(wheels)) {
                Car tmp = car;
                serviceColor.changeCar(tmp, color);
                storage.removeCarFromStorage(car);
                System.out.println("На складе фабрики найдена необходимая машина: ");
                return tmp;
            } else if (car.getLabel().equals(label) && car.getModel().equals(modelReno) && car.getYear() == year && car.getEngineCapacity().equals(capacity)) {
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
        System.out.println("Список возможных цветов Reno: ");
        for (AbleToChangeColor color : colorList) {
            System.out.println(color);
        }
    }

    public void printSizes() {
        System.out.println("Список возможных размеров колес Reno: ");
        for (AbleToChangeWheels size : sizeList) {
            System.out.println(size);
        }
    }

    public void printCapacity() {
        System.out.println("Список возможных объемов двигателей Reno: ");
        for (Capacity capacity : capacityList) {
            System.out.println(capacity);
        }
    }

    public void printModels() {
        System.out.println("Список возможных моделей Reno: ");
        for (ModelReno reno : modelList) {
            System.out.println(reno);
        }
    }
}
