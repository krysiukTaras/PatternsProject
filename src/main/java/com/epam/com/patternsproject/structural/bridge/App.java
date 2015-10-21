package com.epam.com.patternsproject.structural.bridge;

/**
 * Created by taras
 */
public class App {

    public static void main(String[] args) {
        RemoteTVControl phoneControl = new PhoneRemoteControl(new SamsungTV());
        
        phoneControl.turnOn();
        phoneControl.switchToChanel(1);
        phoneControl.turnOff();

        
        phoneControl = new PhoneRemoteControl(new SonyTV());
        phoneControl.turnOff();
        phoneControl.switchToChanel(4);
        phoneControl.turnOff();
    }

}
