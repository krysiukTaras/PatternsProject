package com.epam.com.patternsproject.structural.bridge;

/**
 * Created by taras
 */
public class PhoneRemoteControl extends RemoteTVControl {

    public PhoneRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void switchToChanel(int i) {
        super.switchToChanel(i);
        System.out.println("Switched chanel from phone.");
    }
}
