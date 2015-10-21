package com.epam.com.patternsproject.creational.abstractfactory.impl.ua;

import com.epam.com.patternsproject.creational.abstractfactory.iterface.Images;



public class UAImagesImpl implements Images {
    @Override
    public String getImagesCountry() {
        return "Ukraine";
    }
}
