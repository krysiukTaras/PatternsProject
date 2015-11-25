package com.epam.com.patternsproject.creational.singletone;

public class App {

    public static void main(String[] args) {

        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        Processor processor = new Processor();
        simpleSingleton.log("work started");
        processor.countSum(10);
        simpleSingleton.log("work finished");

        SimpleSingleton s2 = SimpleSingleton.getInstance();
        s2.log("dasdasd");
    }

}
