package org.quiz02_preparation.behavioral_patterns.state_pattern;

public class RedState implements State{
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Red: Stop!");
        context.setState(new YellowState());
    }
}
