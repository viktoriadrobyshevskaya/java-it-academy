package by.it_academy.hw.hw4;

public class ServiceOption extends Service {
    public static void addOption(Car car, Option option) {
        System.out.println("Сервис по опциям добавляет опции.");
        car.addOption(option);
    }
    public static void removeOption(Car car, Option option) {
        System.out.println("Сервис по опциям удаляет опцию.");
        car.removeOption(option);
    }
}
