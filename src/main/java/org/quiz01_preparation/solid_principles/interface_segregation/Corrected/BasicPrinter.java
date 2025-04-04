package org.quiz01_preparation.solid_principles.interface_segregation.Corrected;

public class BasicPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
