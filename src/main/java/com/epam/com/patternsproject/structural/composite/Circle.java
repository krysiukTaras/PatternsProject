package com.epam.com.patternsproject.structural.composite;

/**
 * Created by Taras_Krysiuk on 11/3/2015.
 */
public class Circle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Drawing Circle with color " + color);
    }
}
