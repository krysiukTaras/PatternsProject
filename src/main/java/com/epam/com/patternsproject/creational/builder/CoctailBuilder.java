package com.epam.com.patternsproject.creational.builder;


public abstract class CoctailBuilder {

    protected Coctail coctail;

    public Coctail getCoctail() {
        return coctail;
    }

    public void createNewCoctail() {
        coctail = new Coctail();
    }

    public abstract void buildAlcohol();
    public abstract void buildJuice();
    public abstract void buildIngridients();
}
