package com.epam.com.patternsproject.structural.adapter;

/**
 * Created by taras
 */
public class ElectricityConsumer {

    public static void chargeNotebook(INewElectricitySystem system){
        System.out.println(system.matchWideSocket());
    }

}
