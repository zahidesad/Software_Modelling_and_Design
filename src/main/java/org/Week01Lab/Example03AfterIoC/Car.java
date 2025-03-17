package org.Week01Lab.Example03AfterIoC;

class Car implements ICar{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String needsRepair() {
        return model + " needs repair.";
    }

    public String getModel() {
        return model;
    }

}
