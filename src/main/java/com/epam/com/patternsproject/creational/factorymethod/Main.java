/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.com.patternsproject.creational.factorymethod;

import java.io.File;


/**
 *
 * @author taras
 */
public class Main {
    
    public static void main(String[] args) {
       AbstractWriter writer = new FactoryMethod().getWriter(new File("text.txt"));
       writer.write("txt");
    }
    
}
