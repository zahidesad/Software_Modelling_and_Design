package org.Week05Lab.Example01;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setAirConditioning(true)
                .setSunroof(false)
                .setGPS(true)
                .build();

        Truck truck = new Truck.Builder()
                .setAirConditioning(true)
                .setSunroof(true)
                .setGPS(false)
                .build();

        System.out.println(car);
        System.out.println(truck);
    }
}

