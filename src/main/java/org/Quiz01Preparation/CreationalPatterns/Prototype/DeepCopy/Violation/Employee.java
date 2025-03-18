package org.Quiz01Preparation.CreationalPatterns.Prototype.DeepCopy.Violation;

public class Employee implements Cloneable {
    String name;
    Address address;  // There is an object inside an employee

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Employee) super.clone();  // Shallow Copy
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}
