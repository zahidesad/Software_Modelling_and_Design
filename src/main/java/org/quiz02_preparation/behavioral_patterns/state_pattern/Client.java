package org.quiz02_preparation.behavioral_patterns.state_pattern;

public class Client {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight(new RedState());

        for (int i = 0; i < 6; i++) {
            light.changeState();
        }
    }
}
