package com.epam.com.patternsproject.behavioral.state;

/**
 * Created by taras on 03.11.15.
 */
public class HappyState implements EmotionalState {

    @Override
    public String sayGoodbye() {
        return "Bye, friend!";
    }

    @Override
    public String sayHello() {
        return "Hello, friend!";
    }

}
