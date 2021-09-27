package by.it_academy.hw.hw4;

public class ServiceChangeWheel extends Service{
    public static void changeWheel(Car car, WheelSize newSize) {
        System.out.println("Сервис по колесам меняет размер колес.");
        car.setWheelSize(newSize);
    }
}
