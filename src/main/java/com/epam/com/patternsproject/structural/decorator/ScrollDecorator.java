package com.epam.com.patternsproject.structural.decorator;

/**
 * Created by Taras_Krysiuk on 11/3/2015.
 */
class ScrollDecorator extends Decorator {

    public ScrollDecorator( Widget w ) {
        super( w );
    }
    public void draw() {
        super.draw();
        System.out.println( "  ScrollDecorator" );
    }
}
