package org.Week05Lab.Example03;

public class SportsCar implements Car {
    private boolean specialEquipment = false;

    @Override
    public void assemble() {
        System.out.println("Assembling Sports Car");
    }

    @Override
    public boolean hasSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(boolean specialEquipment) {
        this.specialEquipment = specialEquipment;
    }
}



