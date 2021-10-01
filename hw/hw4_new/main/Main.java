package by.it_academy.hw.hw4_new.main;

import by.it_academy.hw.hw4_new.cars.BMW;
import by.it_academy.hw.hw4_new.cars.Reno;
import by.it_academy.hw.hw4_new.enums.Capacity;
import by.it_academy.hw.hw4_new.enums.Color;
import by.it_academy.hw.hw4_new.enums.WheelSize;
import by.it_academy.hw.hw4_new.store.StoreBMW;
import by.it_academy.hw.hw4_new.store.StoreReno;

/*
Класс завод. Общее количество заводов на ваше усмотрение, минимум 3. На заводе возможно производить только автомобили,
которые допустимы на данном заводе.
Класс Car. Для каждого завода должна быть своя реализация автомобиля который он производит, можно несколько.
Сервис. Для каждой задачи необходим конкретный класс сервиса. Например, сервис для покраски, или сервис для замены колёс.
Салон должен изменять автомобиль на необходимом сервисе. Так же заказ автомобиля должен происходить с нужного завода.
 */
public class Main {
    public static void main(String[] args) {
        StoreBMW bmwStore = new StoreBMW();
        StoreReno storeReno = new StoreReno();

        BMW bmw = bmwStore.searchInStorage(Color.RED, 2019, WheelSize.LARGE, Capacity.LARGE);
        System.out.println(bmw);

        Reno reno = storeReno.makeOrder(Color.GREY, 2020, Capacity.SMALL, WheelSize.LARGE);
        System.out.println(reno);
    }
}
