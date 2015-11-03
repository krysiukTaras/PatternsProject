package com.epam.com.patternsproject.creational.builder;


public class App {

    public static void main(String[] args) {
        Barman barman = new Barman();

        CoctailBuilder bloodyMaryBuilder = new BloodyMaryBuilder();
        CoctailBuilder mojitoBuilder = new MojitoBuilder();

        //create bloodyMary
        barman.setCoctailBuilder(bloodyMaryBuilder);
        barman.createCoctail();
        Coctail bloodMary = barman.getCoctail();
        System.out.println(bloodMary.toString());

        //create mojito
        barman.setCoctailBuilder(mojitoBuilder);
        barman.createCoctail();
        Coctail mojito = barman.getCoctail();
        System.out.println(mojito.toString());
    }
}
