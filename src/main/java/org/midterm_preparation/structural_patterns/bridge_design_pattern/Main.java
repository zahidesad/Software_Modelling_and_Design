package org.midterm_preparation.structural_patterns.bridge_design_pattern;

public class Main {
    public static void main(String[] args) {
        Student student1 = new ComputerEngineeringStudent(new Register());
        student1.sayMySituation();

        Student student2 = new SoftwareEngineeringStudent(new Graduate());
        student2.sayMySituation();
    }
}
