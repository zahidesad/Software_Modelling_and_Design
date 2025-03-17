package org.Week02Lab.Example01After;

public class LSPFixedExample {
    public static void main(String[] args) {
        IVehicle car = new Car();
        car.setSpeed(100);
        System.out.println("Car speed: " + car.getSpeed());

        IVehicle bicycle = new Bicycle();
        bicycle.setSpeed(40);  // This works fine
        System.out.println("Bicycle speed: " + bicycle.getSpeed());
    }
}
