package com.epam.com.patternsproject.structural.adapter;

/**
 * Created by taras
 */
public class Adapter implements INewElectricitySystem {

    private OldElectricitySystem oldElectricitySystem;

    public Adapter(OldElectricitySystem system){
        oldElectricitySystem = system;
    }

    @Override
    public String matchWideSocket() {
        return oldElectricitySystem.matchThinSocket();
    }
}
