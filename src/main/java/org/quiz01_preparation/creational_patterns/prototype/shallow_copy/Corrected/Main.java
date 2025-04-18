package org.quiz01_preparation.creational_patterns.prototype.shallow_copy.Corrected;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John", "IT");

        Employee cloned1 = (Employee) original.clone();
        Employee cloned2 = (Employee) original.clone();

        original.showInfo();  // Name: John, Department: IT
        cloned1.showInfo();   // Name: John, Department: IT
        cloned2.showInfo();   // Name: John, Department: IT
    }
}
