package com.epam.com.patternsproject.structural.bridge;

/**
 * Created by taras
 */
public class SonyTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("Sony TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV turned off");
    }

    @Override
    public void switchToChanel(int i) {
        System.out.println("Sony TV switched to chanel: " + i);
    }

}
