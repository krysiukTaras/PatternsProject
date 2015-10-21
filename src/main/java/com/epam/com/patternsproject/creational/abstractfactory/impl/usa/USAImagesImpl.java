package com.epam.com.patternsproject.creational.abstractfactory.impl.usa;

import com.epam.com.patternsproject.creational.abstractfactory.iterface.Images;



public class USAImagesImpl implements Images {
    @Override
    public String getImagesCountry() {
        return "USA";
    }
}
