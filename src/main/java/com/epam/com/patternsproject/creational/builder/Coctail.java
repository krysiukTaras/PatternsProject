package com.epam.com.patternsproject.creational.builder;

public class Coctail {
    private String alcohol;
    private String juice;
    private String ingridients;

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public void setJuice(String juice) {
        this.juice = juice;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return "Coctail{" +
                "alcohol='" + alcohol + '\'' +
                ", juice='" + juice + '\'' +
                ", ingridients='" + ingridients + '\'' +
                '}';
    }
}
