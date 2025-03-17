package org.Week02Lab.Example01Before;

public class Bicycle extends Vehicle {
    @Override
    public void setSpeed(int speed) {
        if (speed > 50) {
            throw new IllegalArgumentException("Bicycles cannot go above 50 km/h!");
        }
        this.speed = speed;
    }
}
