package by.it_academy.hw.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutomakerReno {
    private List<Label> labelList;
    private List<Capacity> capacityList;
    private List<Color> colorList;
    private List<WheelSize> sizeList;

    private List<Car> warehouse;
    private Service service = new Service();

    public AutomakerReno() {
        labelList = new ArrayList<>();
        labelList.addAll(Arrays.asList(Label.values()));

        capacityList = new ArrayList<>();
        capacityList.addAll(Arrays.asList(Capacity.values()));

        colorList = new ArrayList<>();
        colorList.addAll(Arrays.asList(Color.values()));

        sizeList = new ArrayList<>();
        sizeList.addAll(Arrays.asList(WheelSize.values()));

        warehouse = new ArrayList<>();
        warehouse.add(new Car(Color.RED, Label.DUSTER, 2020, WheelSize.MEDIUM, Capacity.MEDIUM));
        warehouse.add(new Car(Color.GREEN, Label.LAGUNA, 2019, WheelSize.LARGE, Capacity.LARGE));
        warehouse.add(new Car(Color.WHITE, Label.STEPWAY, 2021, WheelSize.SMALL, Capacity.SMALL));
    }

    public List<Car> getWarehouse() {
        return warehouse;
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

    public Car createCar(Color color, Label label, int year, WheelSize size, Capacity capacity) {

        for (Car car : warehouse) {
            if (car.getColor().equals(color) && car.getLabel().equals(label) && car.getYear() == year && car.getWheelSize() == size && car.getEngineCapacity() == capacity) {
                System.out.println("Завод нашел на складе подходящий автомобиль:");
                Car tmpCar = car;
                warehouse.remove(car);     //удаляем машину из хранилища
                return tmpCar;
            } else if (car.getLabel().equals(label) && car.getYear() == year && car.getEngineCapacity() == capacity && car.getColor().equals(color)) {
                System.out.println("Завод нашел на складе автомобиль, который можно изменить и отправляет на Сервис: \n");
                car.printCar();
                Car tmpCar = car;
                warehouse.remove(car);     //удаляем машину из хранилища
                service.changeWheel(tmpCar, size);
                System.out.println("Салон получает автомобиль:");
                return tmpCar;
            } else if (car.getLabel().equals(label) && car.getYear() == year && car.getEngineCapacity() == capacity && car.getWheelSize().equals(size)) {
                System.out.println("Завод нашел на складе автомобиль, который можно изменить и отправляет на Сервис: \n");
                car.printCar();
                Car tmpCar = car;
                warehouse.remove(car);     //удаляем машину из хранилища
                service.changeColor(tmpCar, color);
                System.out.println("Салон получает автомобиль:");
                return tmpCar;
            } else if (car.getLabel().equals(label) && car.getYear() == year && car.getEngineCapacity() == capacity) {
                System.out.println("Завод нашел на складе автомобиль, который можно изменить: \n");
                car.printCar();
                Car tmpCar = car;
                warehouse.remove(car);     //удаляем машину из хранилища
                service.changeColor(tmpCar, color);
                service.changeWheel(tmpCar, size);
                System.out.println("Салон получает автомобиль:");
                return tmpCar;
            }
        }
        return new Car(color, label, year, size, capacity);
    }
}
