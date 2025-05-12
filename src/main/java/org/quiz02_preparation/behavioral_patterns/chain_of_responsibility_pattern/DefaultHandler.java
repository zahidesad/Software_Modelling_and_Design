package org.quiz02_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class DefaultHandler extends Handler{
    @Override
    public void handleRequest(int request) {
        System.out.println("DefaultHandler: No handler for request " + request);
    }
}
