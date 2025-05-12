package org.quiz02_preparation.behavioral_patterns.state_pattern;

// Context Class
public class TrafficLight {
    private State currentState;

    public TrafficLight(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public void changeState() {
        currentState.handle(this);
    }
}
