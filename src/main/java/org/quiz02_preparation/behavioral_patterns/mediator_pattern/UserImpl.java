package org.quiz02_preparation.behavioral_patterns.mediator_pattern;

public class UserImpl extends User {

    public UserImpl(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " says: " + message);
        mediator.sendMessage(message, this);

    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}
