package com.epam.com.patternsproject.behavioral.state;

/**
 * Created by taras on 03.11.15.
 */
public class SadState implements EmotionalState {

    @Override
    public String sayGoodbye() {
        return "Bye. Sniff, sniff.";
    }

    @Override
    public String sayHello() {
        return "Hello. Sniff, sniff.";
    }

}
