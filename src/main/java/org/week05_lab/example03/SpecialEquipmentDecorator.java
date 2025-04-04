package org.week05_lab.example03;

public class SpecialEquipmentDecorator implements CarFactory {
    private final CarFactory factory;

    public SpecialEquipmentDecorator(CarFactory factory) {
        this.factory = factory;
    }

    @Override
    public Car createCar() {
        Car car = factory.createCar();
        System.out.println("Adding special equipment...");

        if (car instanceof SportsCar) {
            ((SportsCar) car).setSpecialEquipment(true);
        } else if (car instanceof Jeep) {
            ((Jeep) car).setSpecialEquipment(true);
        }

        return car;
    }
}

