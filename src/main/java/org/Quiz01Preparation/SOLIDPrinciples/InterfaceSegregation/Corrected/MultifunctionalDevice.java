package org.Quiz01Preparation.SOLIDPrinciples.InterfaceSegregation.Corrected;

public class MultifunctionalDevice implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}