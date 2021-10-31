package by.it_academy.hw.hw4.cars;

import by.it_academy.hw.hw4.enums.*;

import java.util.HashSet;
import java.util.Set;


public class Ferrari extends Car<OptionFerrari, ColorFerrari, WheelSizeFerrari, ModelFerrari> {
    private ColorFerrari colorFerrari;
    private WheelSizeFerrari wheelSizeFerrari;
    private ModelFerrari modelFerrari;
    public Set<OptionFerrari> optionsFerrari;

    public Ferrari(ModelFerrari modelFerrari, int year, Capacity engineCapacity, ColorFerrari colorFerrari, WheelSizeFerrari wheelSizeFerrari, Set<OptionFerrari> optionsFerrari) {
        super(Label.FERRARI, year, engineCapacity);
        this.modelFerrari = modelFerrari;
        this.colorFerrari = colorFerrari;
        this.wheelSizeFerrari = wheelSizeFerrari;
        this.optionsFerrari = optionsFerrari;
    }

    public Ferrari(ModelFerrari modelFerrari, int year, Capacity engineCapacity, ColorFerrari colorFerrari, WheelSizeFerrari wheelSizeFerrari) {
        super(Label.FERRARI, year, engineCapacity);
        this.modelFerrari = modelFerrari;
        this.colorFerrari = colorFerrari;
        this.wheelSizeFerrari = wheelSizeFerrari;
        this.optionsFerrari = new HashSet<>();
    }

    public ModelFerrari getModel() {
        return modelFerrari;
    }

    public ColorFerrari getColor() {
        return colorFerrari;
    }

    public void setColor(ColorFerrari colorFerrari) {
        this.colorFerrari = colorFerrari;
    }

    public WheelSizeFerrari getWheelSize() {
        return wheelSizeFerrari;
    }

    public void setWheelSize(WheelSizeFerrari wheelSizeFerrari) {
        this.wheelSizeFerrari = wheelSizeFerrari;
    }

    public Set<OptionFerrari> getOptionsFerrari() {
        return optionsFerrari;
    }

    public void setOptions(Set<OptionFerrari> optionsFerrari) {
        this.optionsFerrari = optionsFerrari;
    }

    public void addOption(OptionFerrari optionFerrari) {
        if (!optionsFerrari.contains(optionFerrari)) {
            this.optionsFerrari.add(optionFerrari);
        } else {
            System.out.println("В этой машине уже есть такая опция.");
        }
    }

    public void removeOption(OptionFerrari optionFerrari) {
        if (optionsFerrari.contains(optionFerrari)) {
            this.optionsFerrari.remove(optionFerrari);
        } else {
            System.out.println("В этой машине нет такой опции.");
        }
    }

    @Override
    public String toString() {
        return "Модель: " + modelFerrari + super.toString() + " Цвет: " + colorFerrari + " Размер колес: " + wheelSizeFerrari + " Доп.опции: " + optionsFerrari + " ";
    }
}
