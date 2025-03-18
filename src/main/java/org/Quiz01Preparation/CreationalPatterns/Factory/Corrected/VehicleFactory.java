package org.Quiz01Preparation.CreationalPatterns.Factory.Corrected;

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
