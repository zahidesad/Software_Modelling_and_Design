package org.quiz02_preparation.behavioral_patterns.mediator_pattern;

import java.util.ArrayList;

public class MediatorImpl implements IMediator{
    ArrayList<User> users;

    public MediatorImpl() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User u : users) {
            if (u != sender){
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
