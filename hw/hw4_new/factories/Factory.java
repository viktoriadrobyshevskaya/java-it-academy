package by.it_academy.hw.hw4_new.factories;

import by.it_academy.hw.hw4_new.enums.*;
import by.it_academy.hw.hw4_new.servises.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Factory<T> implements CreateCar, SearchInStorage {
    ColorService colorService = new ColorService();
    WheelService wheelService = new WheelService();
    OptionService optionService = new OptionService();

    private List<Label> labelList;
    private List<Capacity> capacityList;
    private List<Color> colorList;
    private List<WheelSize> sizeList;

    public Factory() {
        labelList = new ArrayList<>();
        labelList.addAll(Arrays.asList(Label.values()));

        capacityList = new ArrayList<>();
        capacityList.addAll(Arrays.asList(Capacity.values()));

        colorList = new ArrayList<>();
        colorList.addAll(Arrays.asList(Color.values()));

        sizeList = new ArrayList<>();
        sizeList.addAll(Arrays.asList(WheelSize.values()));
    }

    @Override
    public abstract T createCar(Color color, int year, WheelSize wheelSize, Capacity engineCapacity, String spareWheel);

    @Override
    public abstract T searchInStorage(Color color, int year, WheelSize wheelSize, Capacity engineCapacity);

    public abstract T addOption(T car, Option option);

    public abstract T removeOption(T car, Option option);

    public void printColors() {
        System.out.println("Список возможных цветов: ");
        for (Color color : colorList) {
            System.out.println(color.getValue());
        }
    }

    public void printCapacity() {
        System.out.println("Список возможных объемов двигателей: ");
        for (Capacity capacity : capacityList) {
            System.out.println(capacity.getValue());
        }
    }

    public void printLabels() {
        System.out.println("Список возможных моделей: ");
        for (Label label : labelList) {
            System.out.println(label.getValue());
        }
    }

    public void printSizes() {
        System.out.println("Список возможных размеров колес: ");
        for (WheelSize size : sizeList) {
            System.out.println(size.getValue());
        }
    }
}
