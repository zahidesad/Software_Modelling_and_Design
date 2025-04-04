package org.week02_lab.example02_before;

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