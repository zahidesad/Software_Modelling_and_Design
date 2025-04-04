package org.quiz01_preparation.solid_principles.interface_segregation.Corrected;

public class AdvancedPrinter implements Printer, Scanner{

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
