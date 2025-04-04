package org.midterm_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(int request) {
        if (request == 0) {
            System.out.println("ZeroProcessor: " + request);
        } else {
            super.process(request);
        }
    }
}
