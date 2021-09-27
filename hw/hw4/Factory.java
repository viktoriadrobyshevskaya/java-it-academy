package by.it_academy.hw.hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factory {
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
