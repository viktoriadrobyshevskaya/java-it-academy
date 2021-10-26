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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {
    private static final LinkedList<PartOfRobot> PARTS_LIST = new LinkedList<>();
    private static final Random RANDOM = new Random();
    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(Task1::produce);
        Thread thread1 = new Thread(Task1::consume);
        Thread thread2 = new Thread(Task1::consume);

        thread.setName("Factory");
        thread1.setName("USA");
        thread2.setName("Canada");

        thread.start();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    public static void produce() {
        synchronized (PARTS_LIST) {
            while (!flag) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                PARTS_LIST.add(randomParts(RANDOM.nextInt(6)));
                PARTS_LIST.add(randomParts(RANDOM.nextInt(6)));
                PARTS_LIST.add(randomParts(RANDOM.nextInt(6)));
                System.out.println("Созданы части: " + PARTS_LIST);
                PARTS_LIST.notify();
            }
        }
    }

    public static void consume() {
        List<PartOfRobot> partForOneRobot = new ArrayList<>();
        int count = 0;
        synchronized (PARTS_LIST) {
            while (!flag) {
                try {
                    if (count == 2) {
                        System.out.println(Thread.currentThread().getName() + " is WINNER!");
                        Thread.sleep(2000);
                        flag = true;
                    }

                    if (partForOneRobot.size() == 6) {
                        partForOneRobot.clear();
                        count++;
                        System.out.println(Thread.currentThread().getName() + "создал робота " + count);
                    }

                    PartOfRobot part = getPart(partForOneRobot);
                    if (part != null) {
                        partForOneRobot.add(part);
                    }
                    System.out.println(Thread.currentThread().getName() + " имеет запчасти - " + partForOneRobot);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
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

    public static PartOfRobot getPart(List<PartOfRobot> list) {
        while (PARTS_LIST.isEmpty()) {
            try {
                PARTS_LIST.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PARTS_LIST.removeAll(list);
        System.out.println("В общем листе осталось: " + PARTS_LIST);
        PARTS_LIST.notify();

        if (!PARTS_LIST.isEmpty()) {
            return PARTS_LIST.get(0);
        } else return null;

    }
}
