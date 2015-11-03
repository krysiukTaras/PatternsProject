package com.epam.com.patternsproject.creational.builder;

public class BloodyMaryBuilder extends CoctailBuilder {
    @Override
    public void buildAlcohol() {
        coctail.setAlcohol("Vodka");
    }

    @Override
    public void buildJuice() {
        coctail.setJuice("Tomato+Lemon juice");
    }

    @Override
    public void buildIngridients() {
        coctail.setIngridients("Salt+pepper+lemon");
    }
}
