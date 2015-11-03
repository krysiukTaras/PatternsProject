package com.epam.com.patternsproject.creational.builder;


public class Barman {

    private CoctailBuilder coctailBuilder;

    public void setCoctailBuilder(CoctailBuilder coctailBuilder) {
        this.coctailBuilder = coctailBuilder;
    }

    public Coctail getCoctail() {
        return coctailBuilder.getCoctail();
    }

    public void createCoctail() {
        coctailBuilder.createNewCoctail();
        coctailBuilder.buildAlcohol();
        coctailBuilder.buildJuice();
        coctailBuilder.buildIngridients();
    }
}
