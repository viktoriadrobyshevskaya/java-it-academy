package by.it_academy.hw.hw4.cars;

import by.it_academy.hw.hw4.enums.*;

import java.util.HashSet;
import java.util.Set;


public class Reno extends Car<OptionReno, ColorReno, WheelSizeReno, ModelReno> {
    private ColorReno colorReno;
    private WheelSizeReno wheelSizeReno;
    private ModelReno modelReno;
    public Set<OptionReno> optionsReno;

    public Reno(ModelReno modelReno, int year, Capacity engineCapacity, ColorReno colorReno, WheelSizeReno wheelSizeReno, Set<OptionReno> optionReno) {
        super(Label.RENO, year, engineCapacity);
        this.modelReno = modelReno;
        this.colorReno = colorReno;
        this.wheelSizeReno = wheelSizeReno;
        this.optionsReno = optionReno;
    }

    public Reno(ModelReno modelReno, int year, Capacity engineCapacity, ColorReno colorReno, WheelSizeReno wheelSizeReno) {
        super(Label.RENO, year, engineCapacity);
        this.modelReno = modelReno;
        this.colorReno = colorReno;
        this.wheelSizeReno = wheelSizeReno;
        this.optionsReno = new HashSet<>();
    }

    public ModelReno getModel() {
        return modelReno;
    }

    public ColorReno getColor() {
        return colorReno;
    }

    public void setColor(ColorReno colorReno) {
        this.colorReno = colorReno;
    }

    public WheelSizeReno getWheelSize() {
        return wheelSizeReno;
    }

    public void setWheelSize(WheelSizeReno wheelSizeReno) {
        this.wheelSizeReno = wheelSizeReno;
    }

    public Set<OptionReno> getOptionsReno() {
        return optionsReno;
    }

    public void setOptions(Set<OptionReno> optionsReno) {
        this.optionsReno = optionsReno;
    }

    public void addOption(OptionReno optionReno) {
        if (!optionsReno.contains(optionReno)) {
            this.optionsReno.add(optionReno);
        } else {
            System.out.println("В этой машине уже есть такая опция.");
        }
    }

    public void removeOption(OptionReno optionReno) {
        if (optionsReno.contains(optionReno)) {
            this.optionsReno.remove(optionReno);
        } else {
            System.out.println("В этой машине нет такой опции.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Модель: " + modelReno + " Цвет: " + colorReno + " Размер колес: " + wheelSizeReno + " Доп.опции: " + optionsReno + " ";
    }
}
