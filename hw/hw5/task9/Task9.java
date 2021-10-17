package by.it_academy.hw.hw5.task9;

//Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task9 {
    private static final Random RANDOM = new Random();
    private static final List<Box> listBox = new LinkedList<>();

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(args[0]);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (int i = 0; i < 5; i++) {
                listBox.add(new Box(RANDOM.nextInt(10), RANDOM.nextInt(10), RANDOM.nextInt(10)));
            }
            oos.writeObject(listBox);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
