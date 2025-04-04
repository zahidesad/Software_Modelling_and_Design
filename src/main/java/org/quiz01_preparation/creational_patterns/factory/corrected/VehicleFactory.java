package org.quiz01_preparation.creational_patterns.factory.corrected;

public class VehicleFactory {

    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        }else if (type.equalsIgnoreCase("Truck")) {
            return new Truck();
        }else if (type.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        return null;
    }
}
