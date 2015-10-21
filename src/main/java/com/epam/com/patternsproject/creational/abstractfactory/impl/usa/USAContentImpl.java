package com.epam.com.patternsproject.creational.abstractfactory.impl.usa;

import com.epam.com.patternsproject.creational.abstractfactory.iterface.Content;



public class USAContentImpl implements Content{
    @Override
    public String getContentCountry() {
        return "USA";
    }
}
