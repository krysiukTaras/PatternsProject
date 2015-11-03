package com.epam.com.patternsproject.structural.decorator;

/**
 * Created by Taras_Krysiuk on 11/3/2015.
 */
public class App {

    public static void main( String[] args ) {
        Widget aWidget = new BorderDecorator(
                        new ScrollDecorator(
                                new TextField( 80, 24 )));
        aWidget.draw();
    }

}
