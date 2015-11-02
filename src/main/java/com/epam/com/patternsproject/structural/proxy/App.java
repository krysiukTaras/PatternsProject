package com.epam.com.patternsproject.structural.proxy;

/**
 * Created by taras on 03.11.15.
 */
public class App {

    public static void main(String[] args) {
        final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");

        IMAGE1.displayImage();
        IMAGE1.displayImage();
        IMAGE2.displayImage();
        IMAGE2.displayImage();
        IMAGE1.displayImage();
    }
}
