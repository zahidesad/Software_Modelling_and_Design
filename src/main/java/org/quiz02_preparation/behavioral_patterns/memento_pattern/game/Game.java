package org.quiz02_preparation.behavioral_patterns.memento_pattern.game;

public class Game {
    int health;
    int score;

    public Game() {
        health = 100;
        score = 0;
    }

    public void takeDemage(int amount){
        health -= amount;
    }
    public void increaseScore(int amount){
        score += amount;
    }

    public Memento createMemento(){ //Diğer adıyla SaveGame()
        return new Memento(health, score);
    }

    public void restoreMemento(Memento memento){ // Diğer adıyla loadGame()
        health = memento.getHealth();
        score = memento.getScore();
    }
}
