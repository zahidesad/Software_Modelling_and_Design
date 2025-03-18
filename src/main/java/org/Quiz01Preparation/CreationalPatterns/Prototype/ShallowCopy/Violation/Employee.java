package org.Quiz01Preparation.CreationalPatterns.Prototype.ShallowCopy.Violation;

public class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Department: " + department);
    }
}
