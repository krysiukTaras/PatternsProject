package com.epam.com.patternsproject.behavioral.templatemethod;

/**
 * Created by taras on 02.11.15.
 */
public class Basketball extends Game {
    @Override
    void initGame() {
        System.out.println("Initialize basketball.");
    }

    @Override
    void startGame() {
        System.out.println("Starting play basketball...");
    }

    @Override
    void endGame() {
        System.out.println("Basketball game over.");
    }
}
