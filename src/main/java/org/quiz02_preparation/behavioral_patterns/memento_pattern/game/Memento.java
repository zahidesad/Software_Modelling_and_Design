package org.quiz02_preparation.behavioral_patterns.memento_pattern.game;

public class Memento {
    int health;
    int score;

    public Memento(int health, int score) {
        this.health = health;
        this.score = score;
    }

    public int getHealth() {
        return health;
    }
    public int getScore() {
        return score;
    }
}
