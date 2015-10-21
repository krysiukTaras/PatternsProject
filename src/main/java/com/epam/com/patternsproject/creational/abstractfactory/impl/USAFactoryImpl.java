package com.epam.com.patternsproject.creational.abstractfactory.impl;

import com.epam.com.patternsproject.creational.abstractfactory.impl.usa.USAContentImpl;
import com.epam.com.patternsproject.creational.abstractfactory.impl.usa.USAImagesImpl;
import com.epam.com.patternsproject.creational.abstractfactory.impl.usa.USALocaleImpl;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.AbstractFactory;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.Content;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.Images;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.Locale;


public class USAFactoryImpl implements AbstractFactory {
    @Override
    public Content getContent() {
        return new USAContentImpl();
    }

    @Override
    public Images getImages() {
        return new USAImagesImpl();
    }

    @Override
    public Locale getLocale() {
        return new USALocaleImpl();
    }
}
