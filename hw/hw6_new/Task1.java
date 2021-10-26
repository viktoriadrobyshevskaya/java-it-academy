package by.it_academy.hw.hw6_new;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Producer());
        Thread thread1 = new Thread(new Consumer());
        Thread thread2 = new Thread(new Consumer());

        thread.setName("Завод");
        thread1.setName("Канада");
        thread2.setName("Америка");

        thread.start();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static class Producer implements Runnable {
        Keeper keeper = new Keeper();

        @Override
        public void run() {
            keeper.addPart();
        }
    }

    static class Consumer implements Runnable {
        Keeper keeper = new Keeper();
        List<PartOfRobot> parts_one_robot = new ArrayList<>();

        @Override
        public void run() {
            while (true) {
                keeper.getPart(parts_one_robot);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (parts_one_robot.size() == 6) {
                    System.out.println(Thread.currentThread().getName() + " is WINNER!!!");
                    parts_one_robot.clear();
                    break;
                }
            }
        }
    }
}
