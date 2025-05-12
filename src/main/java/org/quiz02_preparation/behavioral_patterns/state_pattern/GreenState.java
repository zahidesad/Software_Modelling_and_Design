package org.quiz02_preparation.behavioral_patterns.state_pattern;

public class GreenState implements State {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Green: Go!");
        context.setState(new RedState());
    }
}
