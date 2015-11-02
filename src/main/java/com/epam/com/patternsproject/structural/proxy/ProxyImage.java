package com.epam.com.patternsproject.structural.proxy;

/**
 * Created by taras on 03.11.15.
 */
class ProxyImage implements Image {

    private RealImage image = null;
    private String filename = null;

    public ProxyImage(final String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

}
