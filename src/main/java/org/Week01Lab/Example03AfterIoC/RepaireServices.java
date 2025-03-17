package org.Week01Lab.Example03AfterIoC;

public class RepaireServices {
    private ICar car;

    public RepaireServices(ICar car) {
        this.car = car;
    }

    public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }
}

