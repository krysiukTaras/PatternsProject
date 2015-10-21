package com.epam.com.patternsproject.creational.abstractfactory.iterface;

public interface AbstractFactory {
    public Content getContent();
    public Images getImages();
    public Locale getLocale();
}
