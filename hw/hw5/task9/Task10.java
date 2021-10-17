package by.it_academy.hw.hw5.task9;

//Десериализовать объекты из задания #9. Отсортировать их по объёму.
//Вывести на экран. Записать в файл (OUTPUT.txt) самый большой объем.

import java.io.*;
import java.util.*;

public class Task10 {

    public static void main(String[] args) {
        LinkedList<Box> boxList;
        try (FileInputStream inputStream = new FileInputStream(args[0]);
             ObjectInputStream ois = new ObjectInputStream(inputStream);
             FileOutputStream outputStream = new FileOutputStream(args[1]);
             ObjectOutputStream oos = new ObjectOutputStream(outputStream)) {
            boxList = (LinkedList<Box>) ois.readObject();
            boxList.sort(Box::compareTo);
            System.out.println(boxList);
            oos.writeObject(boxList.peekLast());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}