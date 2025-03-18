package org.Quiz01Preparation.SOLIDPrinciples.SingleResponsibility.Corrected;

public class SalaryCalculator {
    public double calculateBonus(Employee employee, double percentage) {
        return employee.getSalary() * percentage / 100;
    }
}
