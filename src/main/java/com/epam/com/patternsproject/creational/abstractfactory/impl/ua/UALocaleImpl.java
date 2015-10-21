package com.epam.com.patternsproject.creational.abstractfactory.impl.ua;

import com.epam.com.patternsproject.creational.abstractfactory.iterface.Locale;



public class UALocaleImpl implements Locale {
    @Override
    public String getLocaleCountry() {
        return "Ukraine";
    }
}
