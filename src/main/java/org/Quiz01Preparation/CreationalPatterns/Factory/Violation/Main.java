package org.Quiz01Preparation.CreationalPatterns.Factory.Violation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();

        Truck truck = new Truck();
        truck.drive();

        // 1. If we want to add Motorcycle, we have to change the Main class.
        // 2. Statements like new Car(), new Truck() are repeated everywhere.


    }
}
