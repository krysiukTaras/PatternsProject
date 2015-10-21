package com.epam.com.patternsproject.creational.abstractfactory;

import com.epam.com.patternsproject.creational.abstractfactory.impl.UAFactoryImpl;
import com.epam.com.patternsproject.creational.abstractfactory.impl.USAFactoryImpl;
import com.epam.com.patternsproject.creational.abstractfactory.iterface.AbstractFactory;



public class App{

    public static void run(String contry){
        AbstractFactory factory = null;
        if(contry.equals("UA")){
            factory = new UAFactoryImpl();
        } else if (contry.equals("USA")){
            factory = new USAFactoryImpl();
        }
        if (factory != null){
            factory.getLocale();
            print("Locale for: " + factory.getLocale().getLocaleCountry());
            print("Images for: " + factory.getImages().getImagesCountry());
            print("Content for: " + factory.getContent().getContentCountry());
        } else {
            print( contry + " - wrong country.");
        }
    }

    private static void print(String msg){
        System.out.println(msg);
    }
}
