package by.it_academy.hw.hw4.factories;

import by.it_academy.hw.hw4.cars.Car;

import java.util.List;

public class Storage {
    private List<Car> storage;

    public Storage(List<Car> storage) {
        this.storage = storage;
    }

    public List<Car> getStorage() {
        return storage;
    }

    public void removeCarFromStorage(Car car){
        storage.remove(car);
    }
    @Override
    public String toString() {
        return "В хранилище находятся: " + storage;
    }
}
