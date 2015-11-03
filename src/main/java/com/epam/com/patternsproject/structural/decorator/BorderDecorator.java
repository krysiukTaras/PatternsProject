package com.epam.com.patternsproject.structural.decorator;

/**
 * Created by Taras_Krysiuk on 11/3/2015.
 */
public class BorderDecorator extends Decorator {

        public BorderDecorator( Widget w ) {
            super( w );
        }
        public void draw() {
            super.draw();
            System.out.println("  BorderDecorator");
        }

}
