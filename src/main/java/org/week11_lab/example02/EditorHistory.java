package org.week11_lab.example02;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {
    private final Deque<Memento> history = new ArrayDeque<>();

    public void push(Memento m) {
        history.push(m);
    }

    public Memento pop() {
        return history.isEmpty() ? new NullMemento() : history.pop();
    }
}

