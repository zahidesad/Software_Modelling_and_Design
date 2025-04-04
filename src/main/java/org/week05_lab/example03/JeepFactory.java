package org.week05_lab.example03;

public class JeepFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Jeep();
    }
}
