package com.epam.com.patternsproject.structural.bridge;

/**
 * Created by taras
 */
public class SamsungTV implements TV{

    @Override
    public void turnOn() {
        System.out.println("Samsung TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV turned off");
    }

    @Override
    public void switchToChanel(int i) {
        System.out.println("Samsung TV switched to chanel: " + i);
    }

}
