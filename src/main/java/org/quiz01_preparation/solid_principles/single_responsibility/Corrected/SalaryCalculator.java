package org.quiz01_preparation.solid_principles.single_responsibility.Corrected;

public class SalaryCalculator {
    public double calculateBonus(Employee employee, double percentage) {
        return employee.getSalary() * percentage / 100;
    }
}
