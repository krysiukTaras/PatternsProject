package com.epam.com.patternsproject.structural.decorator;

/**
 * Created by Taras_Krysiuk on 11/3/2015.
 */
abstract class Decorator implements Widget {

    private Widget wid;

    public Decorator( Widget w ) {
        wid = w;
    }

    public void draw() {
        wid.draw();
    }
}