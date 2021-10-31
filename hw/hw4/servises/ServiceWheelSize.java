package by.it_academy.hw.hw4.servises;

import by.it_academy.hw.hw4.cars.Car;
import by.it_academy.hw.hw4.interfaces.AbleToChangeWheels;

public class ServiceWheelSize implements Service<AbleToChangeWheels> {
    public void changeCar(Car car, AbleToChangeWheels wheels){
        try {
            car.setWheelSize(wheels);
        } catch (Exception e) {
            System.out.println("Вы не можете выбрать эти колеса.");
        }
    }

}
