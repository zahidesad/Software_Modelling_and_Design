package org.Week01Lab.Example02SolutionUsingSingleResponsibility;

public class RepairServices {
     Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

     
     public void repair() {
        System.out.println("Repairing " + vehicle.getModel());
        checkParts();
        orderParts();
    }
    
    public void checkParts() {
        System.out.println("Checking parts for " + vehicle.getModel());
    }
    
    public void orderParts() {
        System.out.println("Ordering parts for " + vehicle.getModel());
    }
}
