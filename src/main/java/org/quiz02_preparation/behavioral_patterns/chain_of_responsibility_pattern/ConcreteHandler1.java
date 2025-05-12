package org.quiz02_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class ConcreteHandler1 extends Handler {

    @Override
    public void  handleRequest(int request) {
        if (request >= 0 && request <= 10) {
            System.out.println("ConcreteHandler1 handled request: " + request);
        }else if (next != null) {
            next.handleRequest(request);
        }
    }
}
