package org.week01_lab.example03_before_IoC;

class Car{
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

class Repairer {
    private Car car;

    public Repairer(Car car) {
        this.car = car;
    }

    public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }
}

             
        
        
