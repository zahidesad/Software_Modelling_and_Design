package org.Quiz01Preparation.CreationalPatterns.Prototype.DeepCopy.Corrected;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John", new Address("New York"));
        Employee cloned = (Employee) original.clone();

        // When I change the address information of the cloned object, it will not change in the original object
        cloned.address.city = "Los Angeles";

        original.showInfo();  // Name: John, City: New York (Correct)
        cloned.showInfo();    // Name: John, City: Los Angeles

    }
}
