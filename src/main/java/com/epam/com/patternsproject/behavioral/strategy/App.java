package com.epam.com.patternsproject.behavioral.strategy;

/**
 * Created by taras on 03.11.15.
 */
public class App {

    public static void main(String[] args) {
        Context context = new Context(new BubbleSort());
        context.sort(null);

        context = new Context (new InsertionSort());
        context.sort(null);
    }

}
