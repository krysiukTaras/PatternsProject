package com.epam.com.patternsproject.structural.composite;

/**
 * Created by Taras_Krysiuk
 */
public class Triangle implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle with color " + color);
    }
}
