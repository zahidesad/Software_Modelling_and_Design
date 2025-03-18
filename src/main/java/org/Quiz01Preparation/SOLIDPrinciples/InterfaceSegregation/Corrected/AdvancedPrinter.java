package org.Quiz01Preparation.SOLIDPrinciples.InterfaceSegregation.Corrected;

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
