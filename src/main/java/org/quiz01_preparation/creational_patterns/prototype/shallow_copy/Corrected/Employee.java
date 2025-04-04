package org.quiz01_preparation.creational_patterns.prototype.shallow_copy.Corrected;

public class Employee implements Cloneable{
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }


    public void showInfo() {
        System.out.println("Name: " + name + ", Department: " + department);
    }
}
