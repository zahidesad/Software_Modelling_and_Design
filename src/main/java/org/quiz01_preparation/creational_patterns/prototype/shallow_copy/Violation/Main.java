package org.quiz01_preparation.creational_patterns.prototype.shallow_copy.Violation;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "IT");
        Employee emp2 = new Employee("John", "IT");  // We are creating the same object again!
        emp1.showInfo();
        emp2.showInfo();
    }
}
