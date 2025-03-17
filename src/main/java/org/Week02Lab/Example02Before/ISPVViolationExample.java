package org.Week02Lab.Example02Before;

public class ISPVViolationExample {
    public static void main(String[] args) {
        IWorker robot = new Robot();
        IWorker human = new Human();

        robot.work();

        human.work();
        human.eat();
        human.sleep();
    }
}