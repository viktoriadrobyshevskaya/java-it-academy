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

public class Task1 {
    public static Factory factory = new Factory();

    public static void main(String[] args) {
        Thread usa = new Thread(Task1::createRobot);
        Thread canada = new Thread(Task1::createRobot);
        usa.start();
        canada.start();
        System.out.println("Finish!");
    }

    public static void createRobot(){
        List<Robot> robots = new LinkedList<>();
        for (int i = 0; i < 20; i++){
            Robot robot = new Robot();
            robot.setRightArm(factory.getNecessaryPart(new RightArm()));
            robot.setLeftArm(factory.getNecessaryPart(new LeftArm()));
            robot.setRightLeg(factory.getNecessaryPart(new RightLeg()));
            robot.setLeftLeg(factory.getNecessaryPart(new LeftLeg()));
            robot.setBody(factory.getNecessaryPart(new Body()));
            robot.setHead(factory.getNecessaryPart(new Head()));

            robots.add(robot);
        }
        System.out.println("I'm done!");
    }
}
