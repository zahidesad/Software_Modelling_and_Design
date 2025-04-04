package org.midterm_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.process(90);
        chain.process(-50);
        chain.process(0);
        chain.process(91);
    }
}
