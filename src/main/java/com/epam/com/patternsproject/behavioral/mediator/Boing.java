package com.epam.com.patternsproject.behavioral.mediator;

/**
 * Created by taras on 03.11.15.
 */
public class Boing implements Colleague {

    @Override
    public void recive(String message) {
        System.out.println("Boing recive: " + message);
    }

}
