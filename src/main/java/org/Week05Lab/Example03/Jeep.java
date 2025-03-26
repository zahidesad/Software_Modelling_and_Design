package org.Week05Lab.Example03;

public class Jeep implements Car {
    private boolean specialEquipment = false;

    @Override
    public void assemble() {
        System.out.println("Assembling Jeep");
    }

    @Override
    public boolean hasSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(boolean specialEquipment) {
        this.specialEquipment = specialEquipment;
    }
}
