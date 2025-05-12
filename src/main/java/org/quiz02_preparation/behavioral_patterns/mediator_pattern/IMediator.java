package org.quiz02_preparation.behavioral_patterns.mediator_pattern;

public interface IMediator {
    public void sendMessage(String message, User sender);
    public void addUser(User user);
}
