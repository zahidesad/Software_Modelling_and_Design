package org.Quiz01Preparation.SOLIDPrinciples.InterfaceSegregation.Corrected;

public class BasicPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
