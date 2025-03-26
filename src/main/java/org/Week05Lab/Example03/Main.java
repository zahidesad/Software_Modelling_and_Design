package org.Week05Lab.Example03;

public class Main {
    public static void main(String[] args) {
        CarFactory sportsFactory = new SpecialEquipmentDecorator(new SportsCarFactory());
        CarFactory jeepFactory = new SpecialEquipmentDecorator(new JeepFactory());

        Car sportsCar = sportsFactory.createCar();
        sportsCar.assemble();
        System.out.println("Sports Car special equipment: " + sportsCar.hasSpecialEquipment());

        Car jeep = jeepFactory.createCar();
        jeep.assemble();
        System.out.println("Jeep special equipment: " + jeep.hasSpecialEquipment());
    }
}

