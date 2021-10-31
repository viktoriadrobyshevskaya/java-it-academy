package by.it_academy.hw.hw4.main;

import by.it_academy.hw.hw4.cars.*;
import by.it_academy.hw.hw4.enums.*;
import by.it_academy.hw.hw4.factories.*;
import by.it_academy.hw.hw4.store.Store;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        //Данный блок выводит информацию по возможным цветам, моделям и др.
        FactoryBMW factoryBMW = new FactoryBMW();
        factoryBMW.printModels();
        factoryBMW.printColors();
        factoryBMW.printSizes();
        factoryBMW.printCapacity();

        //Чтобы создать машину введите: Label, Model, year, Capacity, Color, WheelSize:
        Store store = new Store();
        Car car = store.createOrder(Label.FERRARI, ModelFerrari.F8_TRIBUTO, 2020, Capacity.LARGE, ColorFerrari.BLUE, WheelSizeFerrari.R18);
        System.out.println("Машина 1: " + car);
        Car car2 = store.createOrder(Label.BMW, ModelFerrari.F8_SPIDER, 2019, Capacity.LARGE, ColorReno.BLACK, WheelSizeBMW.R17);
        System.out.println("Машина 2: " + car2);           // ОШИБКА, МЫ НЕ МОЖЕМ СОЗДАТЬ МАШИНУ С ХАРАКТЕРИСТИКАМИ ИЗ РАЗНЫХ КЛАССОВ

        //Добавляем новую опцию и удалить старую:
        store.addNewOptionInCar(car, OptionFerrari.HEADLIGHT_WASHER);
        store.removeOptionInCar(car, OptionBMW.CRUISECONTROL);      // ОШИБКА, МЫ НЕ МОЖЕМ УДАЛИТЬ ОПЦИИ НЕ НАШЕГО КЛАССА

        // Пробуем добавить новый список опций:
        Set<OptionFerrari> list = new HashSet<>();
        list.add(OptionFerrari.HEADLIGHT_WASHER);
        list.add(OptionFerrari.HEATED_SEAT);

        store.setNewOptionsInCar(car, list);
        System.out.println("Машина 1: " + car);

        //Меняем колеса и цвет:
        store.changeCarWheelSize(car, WheelSizeFerrari.R19);
        store.changeColorCar(car, ColorReno.BLACK);     // ОШИБКА, МЫ НЕ МОЖЕМ ВЫЬРАТЬ ЦВЕТ НЕ НАШЕГО КЛАССА
        System.out.println("Машина 1: " + car);
    }
}
