package by.it_academy.hw.hw4;
/*
Класс завод. Общее количество заводов на ваше усмотрение, минимум 3. На заводе возможно производить только автомобили,
которые допустимы на данном заводе.
Класс Car. Для каждого завода должна быть своя реализация автомобиля который он производит, можно несколько.
Сервис. Для каждой задачи необходим конкретный класс сервиса. Например, сервис для покраски, или сервис для замены колёс.
Салон должен изменять автомобиль на необходимом сервисе. Так же заказ автомобиля должен происходить с нужного завода.
 */
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.getNisanCar();
        Car car = store.makeAnOrder(Label.NISAN, Color.GREY,  2019, WheelSize.SMALL, Capacity.LARGE);
        System.out.println(car.toString());
        store.getNisanCar();
    }
}
