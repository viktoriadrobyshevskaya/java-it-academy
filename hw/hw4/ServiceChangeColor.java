package by.it_academy.hw.hw4;

public class ServiceChangeColor extends Service{
    public static void changeColor(Car car, Color newColor) {
        System.out.println("Сервис по цвету меняет цвет.");
        car.setColor(newColor);
    }
}
