package org.quiz01_preparation.creational_patterns.factory.corrected;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();  // Output: Car is driving...

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive();  // Output: Truck is driving...

        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.drive();  // Output: Motorcycle is driving...
    }

}
