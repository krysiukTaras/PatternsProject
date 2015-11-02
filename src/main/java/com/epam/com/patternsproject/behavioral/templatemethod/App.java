package com.epam.com.patternsproject.behavioral.templatemethod;

/**
 * Created by taras on 02.11.15.
 */
public class App {

    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        Game newGame = new Basketball();
        newGame.play();
    }

}
