/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.com.patternsproject.creational.factorymethod;

/**
 *
 * @author taras
 */
public class ConsoleWriter extends AbstractWriter{

    @Override
    public void write(String txt) {
        System.out.println("Write to console:" + txt);
    }
    
}
