package org.quiz02_preparation.behavioral_patterns.state_pattern;

public class YellowState implements State {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Yellow: Ready!");
        context.setState(new GreenState());
    }
}
