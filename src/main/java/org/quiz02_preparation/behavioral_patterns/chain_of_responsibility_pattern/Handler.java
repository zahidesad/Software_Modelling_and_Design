package org.quiz02_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public abstract class Handler {
    protected Handler next;

    public void setNextHandler(Handler next) {
        this.next = next;
    }

    public abstract void  handleRequest(int request);

}
