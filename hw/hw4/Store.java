package by.it_academy.hw.hw4;

import java.util.List;

public class Store {
    FactoryReno factoryReno = new FactoryReno();
    FactoryNisan factoryNisan = new FactoryNisan();
    FactoryBMW factoryBMW = new FactoryBMW();

    public Car makeAnOrder(Label label, Color color, int year, WheelSize size, Capacity capacity) {
        System.out.printf("Салон заказывает на Заводе машину со следующими характеристиками: \n" +
                "цвет: %s, марка: %s, год выпуска: %d, размер колес: %d, " +
                "объем двигателя: %f\n", color.getValue(), label.getValue(), year, size.getValue(), capacity.getValue());

        System.out.println("Салон направляет заказ на Завод-изготовитель.");
        if (label.equals(Label.BMW)) {
            return factoryBMW.createCar(color, year, size, capacity);
        } else if (label.equals(Label.NISAN)) {
            return factoryNisan.createCar(color, year, size, capacity);
        } else if (label.equals(Label.RENO)) {
            return factoryReno.createCar(color, year, size, capacity);
        }
        return null;
    }

    public Car changeColor(Car car, Color newColor) {
        System.out.println("Салон меняет цвет на Сервисе по цвету.");
        ServiceChangeColor.changeColor(car, newColor);
        System.out.println("Салон получает машину:");
        return car;
    }

    public Car changeWheelSize(Car car, WheelSize newSize) {
        ServiceChangeWheel.changeWheel(car, newSize);
        System.out.println("Салон получает машину:");
        return car;
    }

    public Car addOption(Car car, Option option) {
        ServiceOption.addOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }

    public Car removeOption(Car car, Option option) {
        ServiceOption.removeOption(car, option);
        System.out.println("Салон получает машину:");
        return car;
    }

    public void getRenoCar() {
        System.out.println("___________");
        System.out.println("В хранилище " + FactoryReno.class.getSimpleName() + " имеются следующие машины: ");
        for (Car car : factoryReno.getWarehouse()) {
            System.out.println(car.toString());
        }
        System.out.println("___________");
    }

    public void getNisanCar() {
        System.out.println("___________");
        System.out.println("В хранилище " + FactoryNisan.class.getSimpleName() + " имеются следующие машины: ");
        for (Car car : factoryNisan.getWarehouse()) {
            System.out.println(car.toString());
        }
        System.out.println("___________");
    }

    public void getBMWCar() {
        System.out.println("___________");
        System.out.println("В хранилище " + FactoryBMW.class.getSimpleName() + " имеются следующие машины: ");
        for (Car car : factoryBMW.getWarehouse()) {
            System.out.println(car.toString());
        }
        System.out.println("___________");
    }
}
