package com.epam.com.patternsproject.structural.adapter;

import com.epam.com.patternsproject.structural.adapter.INewElectricitySystem;

/**
 * Created by taras
 */
public class NewElectricitySystem implements INewElectricitySystem{
    @Override
    public String matchWideSocket() {
        return "220V new";
    }
}
