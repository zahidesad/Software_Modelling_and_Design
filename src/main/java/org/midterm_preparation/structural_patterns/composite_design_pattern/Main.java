package org.midterm_preparation.structural_patterns.composite_design_pattern;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Zahid", "Backend Developer");
        Developer dev2 = new Developer(101, "Esad", "Frontend Developer");

        Manager man1 = new Manager(200, "Baltacı", "Product Manager");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(man1);

        companyDirectory.showEmployeeDetails();
    }
}
