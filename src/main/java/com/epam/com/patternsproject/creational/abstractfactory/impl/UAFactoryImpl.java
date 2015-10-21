package com.epam.com.patternsproject.creational.abstractfactory.impl;

import com.epam.com.patternsproject.creational.abstractfactory.impl.ua.UAContentImpl;
import com.epam.com.patternsproject.creational.abstractfactory.impl.ua.UAImagesImpl;
import com.epam.com.patternsproject.creational.abstractfactory.impl.ua.UALocaleImpl;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.AbstractFactory;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.Content;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.Images;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.Locale;





public class UAFactoryImpl implements AbstractFactory {
    @Override
    public Content getContent() {
        return new UAContentImpl();
    }

    @Override
    public Images getImages() {
        return new UAImagesImpl();
    }

    @Override
    public Locale getLocale() {
        return new UALocaleImpl();
    }
}
