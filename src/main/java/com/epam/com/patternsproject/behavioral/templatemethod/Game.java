package com.epam.com.patternsproject.behavioral.templatemethod;

/**
 * Created by taras on 02.11.15.
 */
public abstract class Game {

    abstract void initGame();
    abstract void startGame();
    abstract void endGame();

    public void play(){
        initGame();
        startGame();
        endGame();
    }
}
