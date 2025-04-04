package org.week02_lab.example01_before;

public class LSPViolationExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.setSpeed(100);
        System.out.println("Car speed: " + car.getSpeed());

        Vehicle bicycle = new Bicycle();
        bicycle.setSpeed(100);
    }
}
