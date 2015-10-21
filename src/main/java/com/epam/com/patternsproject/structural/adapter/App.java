package com.epam.com.patternsproject.structural.adapter;

/**
 * Created by taras
 */
public class App {

    public static void main(String[] args) {
        
        ElectricityConsumer.chargeNotebook(new NewElectricitySystem());
        ElectricityConsumer.chargeNotebook(new Adapter(new OldElectricitySystem()));
        
    }

}
