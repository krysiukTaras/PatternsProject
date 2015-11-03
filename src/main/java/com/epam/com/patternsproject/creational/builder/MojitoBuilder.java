package com.epam.com.patternsproject.creational.builder;

public class MojitoBuilder extends CoctailBuilder {

    @Override
    public void buildAlcohol() {
        coctail.setAlcohol("White Rum");
    }

    @Override
    public void buildJuice() {
        coctail.setJuice("Sprite");
    }

    @Override
    public void buildIngridients() {
        coctail.setIngridients("Lime+mint+sugar");
    }
}
