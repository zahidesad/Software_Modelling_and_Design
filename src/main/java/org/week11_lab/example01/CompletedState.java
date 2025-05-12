package org.week11_lab.example01;


public class CompletedState implements State {
    @Override
    public void claim(Task task) {
        throw new IllegalStateException("Cannot claim a completed task.");
    }

    @Override
    public void reject(Task task) {
        throw new IllegalStateException("Cannot reject a completed task.");
    }

    @Override
    public void complete(Task task) {
        throw new IllegalStateException("Task is already completed.");
    }

    @Override
    public void pause(Task task) {
        throw new IllegalStateException("Cannot pause a completed task.");
    }

    @Override
    public String getStatus() {
        return "Completed";
    }
}

