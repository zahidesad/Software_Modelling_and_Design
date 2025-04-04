package org.week02_lab.example02_after;

public class ISPFixedExample {
    public static void main(String[] args) {
        IWorkable robot = new Robot();
        IWorkable humanWorker = new Human();
        IEatable humanEater = new Human();
        ISleepable humanSleeper = new Human();

        robot.work();

        humanWorker.work();
        humanEater.eat();
        humanSleeper.sleep();
    }
}
