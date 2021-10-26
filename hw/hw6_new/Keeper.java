package by.it_academy.hw.hw6_new;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Keeper {
    private static final LinkedList<PartOfRobot> PARTS_LIST = new LinkedList<>();
    private static final Random RANDOM = new Random();

    public void addPart() {
        synchronized (PARTS_LIST) {
            while (true) {
                if (!PARTS_LIST.isEmpty()) {
                    try {
                        PARTS_LIST.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                PARTS_LIST.add(randomParts(RANDOM.nextInt(6)));
                System.out.println("В хранилище: " + PARTS_LIST);
                PARTS_LIST.notify();
            }
        }
    }

    public void getPart(List<PartOfRobot> list) {
        synchronized (PARTS_LIST) {
            PARTS_LIST.removeAll(list);
            PartOfRobot part = PARTS_LIST.poll();
            if (!list.contains(part) && part != null) {
                list.add(part);
            }

            System.out.println("У " + Thread.currentThread().getName() + list);
            PARTS_LIST.notify();
        }
    }

    public static PartOfRobot randomParts(int number) {
        PartOfRobot part = null;
        for (PartOfRobot i : PartOfRobot.values()) {
            if (i.getValue() == number) {
                part = i;
            }
        }
        return part;
    }
}
