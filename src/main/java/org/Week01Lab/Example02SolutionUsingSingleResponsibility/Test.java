/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.Week01Lab.Example02SolutionUsingSingleResponsibility;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        RepairServices rs=new RepairServices();
        rs.setVehicle(new Vehicle("Togg"));
        rs.setVehicle(new Vehicle("Sedan"));
        rs.setVehicle(new Vehicle("Sedan"));
        
    }
}
