package by.it_academy.hw.hw6;
/* Есть две страны (Можно больше). Они создают армии роботов, чтобы напасть друг на друга.
Робот состоит из 6 частей:
1) руки(левая, правая);
2) ноги(левая, правая);
3) тело;
4) голова;
Есть нейтральный завод. Который производит одну случайную часть в какую-то единицу времени, например раз в 5 секунд.
Соответственно эти страны пытаются взять с завода нужные им части для составления робота (лишние не брать, то что не
забрали - хранится на заводе). Кто первый соберёт армию из 20 роботов тот и победил. О чем должно быть написано в консоль.
Программа должна корректно завершиться.*/

import by.it_academy.hw.hw6.parts.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Factory {
    private List<PartOfRobot> storageParts;

    public Factory() {
        storageParts = new LinkedList<>();
        try {
            while (true) {
                storageParts.add(createRandomPart());
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Что-то пошло не так.");
        }
    }

    public PartOfRobot createRandomPart() {
        Random random = new Random();
        PartOfRobot part = switch (random.nextInt(7)) {
            case 1 -> new RightArm();
            case 2 -> new LeftArm();
            case 3 -> new RightLeg();
            case 4 -> new LeftLeg();
            case 5 -> new Body();
            case 6 -> new Head();
            default -> null;
        };
        return part;
    }

    public List<PartOfRobot> getStorageParts() {
        return storageParts;
    }

    public PartOfRobot getNecessaryPart(PartOfRobot partOfRobot) {
        for (PartOfRobot part : storageParts) {
            if (storageParts.contains(partOfRobot)) {
                PartOfRobot tmp = part;
                storageParts.remove(part);
                return tmp;
            }
        }
        return null;
    }
}