package org.quiz01_preparation.creational_patterns.prototype.shallow_copy.Violation;

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
