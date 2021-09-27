package by.it_academy.hw.hw3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Car car = store.makeAnOrder(Color.GREEN, Label.LAGUNA, 2019, WheelSize.SMALL, Capacity.LARGE);
        car.printCar();
        System.out.println("________________");
        store.addOption(car, Option.CONDITIONER);
        store.addOption(car, Option.CRUISECONTROL);
        car.printCar();
        store.removeOption(car, Option.CONDITIONER);
        car.printCar();

    }
}
