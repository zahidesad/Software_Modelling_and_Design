package org.quiz02_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request <= 20) {
            System.out.println("ConcreteHandler2 handled request: " + request);
        }else if(next != null){
            next.handleRequest(request);
        }
    }
}
