package com.epam.com.patternsproject.behavioral.strategy;

/**
 * Created by taras on 03.11.15.
 */
class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] input) {
        strategy.sort(input);
    }


}
