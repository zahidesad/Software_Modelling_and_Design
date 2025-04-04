package org.quiz01_preparation.solid_principles.single_responsibility.Violation;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Violation 1
    public void saveToFile() {
        try (FileWriter writer = new FileWriter(name + ".txt")) {
            writer.write("Employee: " + name + ", Salary: " + salary);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Violation 2
    public double calculateBonus(double percentage) {
        return salary * percentage / 100;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}