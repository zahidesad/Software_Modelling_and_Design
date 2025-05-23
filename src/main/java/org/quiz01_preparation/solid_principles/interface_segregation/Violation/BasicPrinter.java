package org.quiz01_preparation.solid_principles.interface_segregation.Violation;

public class BasicPrinter implements MultifunctionalPrinter{

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() { // Unnecessary method implementation
        throw new UnsupportedOperationException("Scanning not supported");
    }

    @Override
    public void fax() { // Unnecessary method implementation
        throw new UnsupportedOperationException("Faxing not supported");
    }
}
