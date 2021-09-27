package by.it_academy.hw.hw3;

public class Store {

    private AutomakerReno automaker = new AutomakerReno();
    Service service = new Service();

    public Car makeAnOrder(Color color, Label label, int year, WheelSize size, Capacity capacity) {
        System.out.printf("Салон заказывает на Заводе машину со следующими характеристиками: \n" +
                "цвет: %s, марка: %s, год выпуска: %d, размер колес: %d, " +
                "объем двигателя: %f\n", color.getValue(), label.getValue(), year, size.getValue(), capacity.getValue());

        return automaker.createCar(color, label, year, size, capacity);
    }

    public void printWarehouse() {
        System.out.println("____________");

        System.out.println("Список машин в хранилище: ");
        for (Car car : automaker.getWarehouse()) {
            car.printCar();
        }
        System.out.println("____________");
    }

    public Car changeColor(Car car, Color newColor) {
        System.out.println("Салон меняет цвет на Сервисе по цвету.");
        service.changeColor(car, newColor);
        System.out.println("Салон получает машину:");
        return car;
    }

    public Car changeWheelSize(Car car, WheelSize newSize) {
        service.changeWheel(car, newSize);
        return car;
    }

    public Car addOption(Car car, Option option) {
        service.addOption(car, option);
        return car;
    }

    public Car removeOption(Car car, Option option) {
        service.removeOption(car, option);
        return car;
    }
}
