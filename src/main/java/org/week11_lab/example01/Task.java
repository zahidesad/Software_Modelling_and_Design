package org.week11_lab.example01;

public class Task {
    private State state;

    public Task() {
        this.state = new PendingState();
    }

    protected void setState(State newState) {
        this.state = newState;
    }

    public void claim() {
        state.claim(this);
    }

    public void reject() {
        state.reject(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void pause() {
        state.pause(this);
    }

    public String getStatus() {
        return state.getStatus();
    }

    @Override
    public String toString() {
        return "Task is currently " + getStatus();
    }
}

