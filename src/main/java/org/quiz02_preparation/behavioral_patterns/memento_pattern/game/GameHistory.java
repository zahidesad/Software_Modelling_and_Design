package org.quiz02_preparation.behavioral_patterns.memento_pattern.game;

import java.util.Stack;

public class GameHistory {
    Stack<Memento> history = new Stack<>();

    public void saveGame(Game game) {
        history.push(game.createMemento());
    }

    public void getGame(Game game) {
        Memento m = history.pop();
        game.restoreMemento(m);
    }
}
