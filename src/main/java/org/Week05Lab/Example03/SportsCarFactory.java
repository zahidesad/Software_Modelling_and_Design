package org.Week05Lab.Example03;

public class SportsCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SportsCar();
    }
}
