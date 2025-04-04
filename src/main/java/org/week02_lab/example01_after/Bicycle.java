package org.week02_lab.example01_after;

public class Bicycle implements IVehicle {
    private int speed;

    @Override
    public void setSpeed(int speed) {
        if (speed > 50) {
            throw new IllegalArgumentException("Bicycles cannot go above 50 km/h!");
        }
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
