package by.it_academy.hw.hw2.task10;

/*
    Задача 10:
    Используя класс Box из задания 2, необходимо добавить в него конструктор, который принимает строку вида:
    Box[1,2,3] или Box[2] или Box[1,2]
    И как результат создает соответствующий объект.
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box("Box[2,3,4]");
        Box box2 = new Box("Box[2]");
        Box box3 = new Box("Box[2,3]");

        System.out.println(box.toString());
        System.out.println(box2.toString());
        System.out.println(box3.toString());
    }
}
