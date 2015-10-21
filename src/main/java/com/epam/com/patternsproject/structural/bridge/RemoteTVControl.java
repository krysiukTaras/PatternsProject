package com.epam.com.patternsproject.structural.bridge;

/**
 * Created by taras
 */
public abstract class RemoteTVControl {

    private TV tv;

    public RemoteTVControl(TV tv){
        this.tv = tv;
    }

    public void turnOn(){
        this.tv.turnOn();
    }

    public void turnOff(){
        this.tv.turnOff();
    }

    public void switchToChanel(int i){
        this.tv.switchToChanel(i);
    }
}
