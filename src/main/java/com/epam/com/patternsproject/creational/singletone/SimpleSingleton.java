package com.epam.com.patternsproject.creational.singletone;

public class SimpleSingleton {

    private int count = 0;

    private SimpleSingleton(){

    }

    private static SimpleSingleton simpleSingletonInstance = null;

    public static SimpleSingleton getInstance(){

        synchronized (SimpleSingleton.class){
            if (simpleSingletonInstance == null){
                simpleSingletonInstance = new SimpleSingleton();
        }

        }
        return simpleSingletonInstance;
    }

    public void log(String message){
        System.out.println(count + ": " + message);
        count++;
    }
}
