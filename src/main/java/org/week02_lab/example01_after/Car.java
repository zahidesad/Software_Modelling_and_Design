package org.week02_lab.example01_after;

public class Car implements IVehicle {
    private int speed;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
