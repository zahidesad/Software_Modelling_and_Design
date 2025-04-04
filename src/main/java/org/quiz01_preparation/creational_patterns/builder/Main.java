package org.quiz01_preparation.creational_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder("Intel I7", 16)
                            .setSSD(true)
                            .setGraphicsCard(false).build();

        System.out.println(pc.toString());
    }
}
