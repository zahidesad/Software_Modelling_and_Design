package org.Quiz01Preparation.CreationalPatterns.Prototype.ShallowCopy.Corrected;

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
