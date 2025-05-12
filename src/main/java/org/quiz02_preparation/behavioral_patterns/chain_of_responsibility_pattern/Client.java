package org.quiz02_preparation.behavioral_patterns.chain_of_responsibility_pattern;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new DefaultHandler();

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        int[] requests = {2, 14, 25, -1};
        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}
