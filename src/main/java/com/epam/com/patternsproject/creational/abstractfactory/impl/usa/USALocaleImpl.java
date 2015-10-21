package com.epam.com.patternsproject.creational.abstractfactory.impl.usa;

import com.epam.com.patternsproject.creational.abstractfactory.iterface.Locale;



public class USALocaleImpl implements Locale{
    @Override
    public String getLocaleCountry() {
        return "USA";
    }
}
