/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.com.patternsproject.creational.factorymethod;

import java.io.Console;
import java.io.File;

/**
 *
 * @author taras
 */
public class FactoryMethod {
 
    public AbstractWriter getWriter(Object target){
        AbstractWriter writer = null;
        if(target instanceof File){
            writer = new FileWriter();
        } else if(target instanceof Console){
            writer = new ConsoleWriter();
        }
        
        return writer;
    }
    
}
