package org.midterm_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public abstract class Processor {
    Processor nextProcessor;

    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(int request){
        if(nextProcessor != null){
            nextProcessor.process(request);
        }
    }
}
