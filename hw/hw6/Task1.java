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

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    private static final LinkedList<Part> PARTS_LIST = new LinkedList<>();
    private static final LinkedList<Robot> ROBOTS_CANADA = new LinkedList<>();
    private static final LinkedList<Robot> ROBOTS_USA = new LinkedList<>();
    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws InterruptedException {
        Thread usa = new Thread(Task1::usaConsume);
        Thread canada = new Thread(Task1::canadaConsume);
        Thread factory = new Thread(Task1::produce);
        factory.start();
        Thread.sleep(5000);
        usa.start();
        canada.start();
        factory.join();
        usa.join();
        canada.join();
        System.out.println("Finish!");
    }

    public static void produce() {
        synchronized (PARTS_LIST) {
            while (true) {
                Part part = randomParts(RANDOM.nextInt(7));
                PARTS_LIST.add(part);
                System.out.println("Создана: " + part);
                try {
                    PARTS_LIST.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void usaConsume() {
        int count = 0;
        synchronized (PARTS_LIST) {
            while (true) {
                Robot robot = new Robot();
                for (Part part : PARTS_LIST) {
                    if (robot.getRightArm() == null && part.equals(Part.RIGHT_ARM)) {
                        robot.setRightArm(part);
                        System.out.println("USA забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getLeftArm() == null && part.equals(Part.LEFT_ARM)) {
                        robot.setLeftArm(part);
                        System.out.println("USA забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getRightLeg() == null && part.equals(Part.RIGHT_LEG)) {
                        robot.setRightLeg(part);
                        System.out.println("USA забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getLeftLeg() == null && part.equals(Part.LEFT_LEG)) {
                        robot.setLeftLeg(part);
                        System.out.println("USA забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getBody() == null && part.equals(Part.BODY)) {
                        robot.setBody(part);
                        System.out.println("USA забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getHead() == null && part.equals(Part.HEAD)) {
                        robot.setHead(part);
                        System.out.println("USA забрала " + part);
                        PARTS_LIST.remove(part);
                    }
                }
                if (robot.getRightLeg() != null && robot.getRightArm() != null
                        && robot.getLeftLeg() != null && robot.getLeftArm() != null
                        && robot.getBody() != null && robot.getHead() != null) {
                    ROBOTS_USA.add(robot);
                    System.out.println("Usa создала робота");
                }
                PARTS_LIST.notify();
                count++;
                if (count == 20) {
                    System.out.println("USA is done!");
                    break;
                }
            }
        }
    }

    public static void canadaConsume() {
        int count = 0;
        synchronized (PARTS_LIST) {
            while (true) {
                Robot robot = new Robot();
                for (Part part : PARTS_LIST) {
                    if (robot.getRightArm() == null && part.equals(Part.RIGHT_ARM)) {
                        robot.setRightArm(part);
                        System.out.println("Canada забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getLeftArm() == null && part.equals(Part.LEFT_ARM)) {
                        robot.setLeftArm(part);
                        System.out.println("Canada забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getRightLeg() == null && part.equals(Part.RIGHT_LEG)) {
                        robot.setRightLeg(part);
                        System.out.println("Canada забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getLeftLeg() == null && part.equals(Part.LEFT_LEG)) {
                        robot.setLeftLeg(part);
                        System.out.println("Canada забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getBody() == null && part.equals(Part.BODY)) {
                        robot.setBody(part);
                        System.out.println("Canada забрала " + part);
                        PARTS_LIST.remove(part);
                    } else if (robot.getHead() == null && part.equals(Part.HEAD)) {
                        robot.setHead(part);
                        System.out.println("Canada забрала " + part);
                        PARTS_LIST.remove(part);
                    }
                }
                if (robot.getRightLeg() != null && robot.getRightArm() != null
                        && robot.getLeftLeg() != null && robot.getLeftArm() != null
                        && robot.getBody() != null && robot.getHead() != null) {
                    ROBOTS_CANADA.add(robot);
                    System.out.println("Canada создала робота.");
                }
                PARTS_LIST.notify();
                count++;
                if (count == 20) {
                    System.out.println("Canada is done!");
                    break;
                }
            }
        }
    }

    public static Part randomParts(int i) {
        return switch (i) {
            case 1 -> Part.RIGHT_ARM;
            case 2 -> Part.LEFT_ARM;
            case 3 -> Part.RIGHT_LEG;
            case 4 -> Part.LEFT_LEG;
            case 5 -> Part.BODY;
            default -> Part.HEAD;
        };
    }
}
