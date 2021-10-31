package by.it_academy.hw.hw4.servises;

import by.it_academy.hw.hw4.cars.Car;
import by.it_academy.hw.hw4.interfaces.AbleToChangeColor;

public class ServiceColor implements Service<AbleToChangeColor> {
    public void changeCar(Car car, AbleToChangeColor color) {
        try {
            car.setColor(color);
        } catch (ClassCastException e){
            System.out.println("Вы не можете выбрать этот цвет.");
        }
    }
}
