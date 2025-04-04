package org.midterm_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class Chain {
    private Processor chain;

    public Chain() {
        // Chain: Negative → Zero → Positive
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }

    public void process(int request) {
        chain.process(request);
    }
}
