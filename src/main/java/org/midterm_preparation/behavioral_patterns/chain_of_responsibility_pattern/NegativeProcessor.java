package org.midterm_preparation.behavioral_patterns.chain_of_responsibility_pattern;

class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(int request) {
        if (request < 0) {
            System.out.println("NegativeProcessor: " + request);
        } else {
            super.process(request);
        }
    }
}
