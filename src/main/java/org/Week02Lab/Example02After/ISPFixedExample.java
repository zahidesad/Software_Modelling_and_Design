package org.Week02Lab.Example02After;

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
