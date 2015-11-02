package com.epam.com.patternsproject.behavioral.templatemethod;

/**
 * Created by taras on 02.11.15.
 */
public class Football extends Game {
    @Override
    void initGame() {
        System.out.println("Initialize football.");
    }

    @Override
    void startGame() {
        System.out.println("Starting play football...");
    }

    @Override
    void endGame() {
        System.out.println("Football game over.");
    }
}
