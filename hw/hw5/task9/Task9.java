package by.it_academy.hw.hw5.task9;

//Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.

import java.io.*;
import java.util.Random;

public class Task9 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("src/by/it_academy/hw/hw5/task9/file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < 5; i++) {
            oos.writeObject(new Box(RANDOM.nextInt(10), RANDOM.nextInt(10), RANDOM.nextInt(10)));
        }
        oos.close();
    }
}
