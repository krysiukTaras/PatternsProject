package com.epam.com.patternsproject.behavioral.mediator;

/**
 * Created by taras
 */
public class Helicopter implements Colleague{

    @Override
    public void recive(String message) {
        System.out.println("Helicopter recive: " + message);
    }

}
