package org.Quiz01Preparation.SOLIDPrinciples.SingleResponsibility.Corrected;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeePersistence {
    public void saveToFile(Employee employee) {
        try (FileWriter writer = new FileWriter(employee.getName() + ".txt")) {
            writer.write("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
