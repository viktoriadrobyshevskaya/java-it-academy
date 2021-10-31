package by.it_academy.hw.hw4.cars;

import by.it_academy.hw.hw4.enums.*;

import java.util.*;

public class BMW extends Car<OptionBMW, ColorBMW, WheelSizeBMW, ModelBMW> {
    private ColorBMW colorBMW;
    private WheelSizeBMW wheelSizeBMW;
    private ModelBMW modelBMW;
    public Set<OptionBMW> optionsBMW;

    public BMW(ModelBMW modelBMW, int year, Capacity engineCapacity, ColorBMW colorBMW, WheelSizeBMW wheelSizeBMW, Set<OptionBMW> optionsBMW) {
        super(Label.BMW, year, engineCapacity);
        this.modelBMW = modelBMW;
        this.colorBMW = colorBMW;
        this.wheelSizeBMW = wheelSizeBMW;
        this.optionsBMW = optionsBMW;
    }

    public BMW(ModelBMW modelBMW, int year, Capacity engineCapacity, ColorBMW colorBMW, WheelSizeBMW wheelSizeBMW) {
        super(Label.BMW, year, engineCapacity);
        this.modelBMW = modelBMW;
        this.colorBMW = colorBMW;
        this.wheelSizeBMW = wheelSizeBMW;
        this.optionsBMW = new HashSet<>();
    }

    public ColorBMW getColor() {
        return colorBMW;
    }

    public void setColor(ColorBMW colorBMW) {
        this.colorBMW = colorBMW;
    }

    public ModelBMW getModel() {
        return modelBMW;
    }

    public WheelSizeBMW getWheelSize() {
        return wheelSizeBMW;
    }

    public void setWheelSize(WheelSizeBMW wheelSizeBMW) {
        this.wheelSizeBMW = wheelSizeBMW;
    }

    public Set<OptionBMW> getOptionsBMW() {
        return optionsBMW;
    }

    public void setOptions(Set<OptionBMW> optionBMW) {
        this.optionsBMW = optionBMW;
    }

    public void addOption(OptionBMW optionBMW) {
        if (!optionsBMW.contains(optionBMW)) {
            this.optionsBMW.add(optionBMW);
        } else {
            System.out.println("В этой машине уже есть такая опция.");
        }
    }

    public void removeOption(OptionBMW optionBMW) {
        if (optionsBMW.contains(optionBMW)) {
            this.optionsBMW.remove(optionBMW);
        } else {
            System.out.println("В этой машине нет такой опции.");
        }
    }

    @Override
    public String toString() {
        return "Модель: " + modelBMW + super.toString() + "Цвет: " + colorBMW + " Размер колес: " + wheelSizeBMW + " Доп.опции: " + optionsBMW + " ";
    }
}
