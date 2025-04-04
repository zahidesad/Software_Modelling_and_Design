package org.quiz01_preparation.creational_patterns.prototype.deep_copy.Violation;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John", new Address("New York"));
        Employee cloned = (Employee) original.clone();

        // When I change the cloned object address information, it will also change in original object
        cloned.address.city = "Los Angeles";

        original.showInfo();  // Name: John, City: Los Angeles (Wrong)
        cloned.showInfo();    // Name: John, City: Los Angeles

    }
}
