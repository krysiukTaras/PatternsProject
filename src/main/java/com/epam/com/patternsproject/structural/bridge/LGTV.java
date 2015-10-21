package com.epam.com.patternsproject.structural.bridge;

/**
 * Created by taras
 */
public class LGTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("Lg TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lg TV turned off");
    }

    @Override
    public void switchToChanel(int i) {
        System.out.println("Lg TV switched to chanel: " + i);
    }
}
