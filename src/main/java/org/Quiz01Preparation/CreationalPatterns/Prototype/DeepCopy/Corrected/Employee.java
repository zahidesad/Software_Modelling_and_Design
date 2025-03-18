package org.Quiz01Preparation.CreationalPatterns.Prototype.DeepCopy.Corrected;

public class Employee implements Cloneable {
    String name;
    Address address;  // There is an object inside an employee

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee cloned =  (Employee) super.clone();
        cloned.address = new Address(this.address.city);
        return cloned;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}
