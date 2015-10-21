package com.epam.com.patternsproject.creational.abstractfactory.impl.ua;

import com.epam.com.patternsproject.creational.abstractfactory.iterface.Content;



public class UAContentImpl implements Content {
    @Override
    public String getContentCountry() {
        return "Ukraine";
    }
}
