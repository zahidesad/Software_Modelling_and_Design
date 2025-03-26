package org.Week05Lab.Example03;

public class JeepFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Jeep();
    }
}
