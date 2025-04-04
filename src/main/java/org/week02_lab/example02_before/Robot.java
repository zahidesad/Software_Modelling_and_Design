package org.week02_lab.example02_before;

public class Robot implements IWorker {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        // Robots do not eat, but they must implement this method
        throw new UnsupportedOperationException("Robots do not eat!");
    }

    @Override
    public void sleep() {
        // Robots do not sleep, but they must implement this method
        throw new UnsupportedOperationException("Robots do not sleep!");
    }
}
