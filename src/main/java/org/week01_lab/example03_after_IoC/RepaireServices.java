package org.week01_lab.example03_after_IoC;

public class RepaireServices {
    private ICar car;

    public RepaireServices(ICar car) {
        this.car = car;
    }

    public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }
}

