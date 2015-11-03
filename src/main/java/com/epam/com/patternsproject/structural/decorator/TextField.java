package com.epam.com.patternsproject.structural.decorator;

/**
 * Created by Taras_Krysiuk on 11/3/2015.
 */
public class TextField implements Widget {

    private int width, height;
    public TextField( int w, int h ) {
        width  = w;
        height = h;
    }
    public void draw() {
        System.out.println( "TextField: " + width + ", " + height );
    }

}
