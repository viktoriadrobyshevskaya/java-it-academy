package by.it_academy.hw.hw4_new.main;

import by.it_academy.hw.hw4_new.cars.Ferrari;
import by.it_academy.hw.hw4_new.enums.*;
import by.it_academy.hw.hw4_new.cars.Reno;
import by.it_academy.hw.hw4_new.store.StoreFerrari;
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
        // пример 1: делает запрос и машина находится в хранилище:
        StoreReno storeReno = new StoreReno();
        Reno reno = storeReno.makeOrder(Color.GREY, 2020, Capacity.SMALL, WheelSize.LARGE, Trunk.SMALL);
        System.out.println(reno);

        System.out.println("____________");

        // пример 2: делает запрос. В хранилище не найдено.Создает новую машину.
        StoreFerrari storeFerrari = new StoreFerrari();
        Ferrari ferrari = storeFerrari.makeOrder(Color.RED, 2020, Capacity.LARGE, WheelSize.LARGE, Spoiler.BACK);
        System.out.println(ferrari);

    }
}
