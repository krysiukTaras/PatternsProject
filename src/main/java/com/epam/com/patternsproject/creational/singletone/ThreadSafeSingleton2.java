package com.epam.com.patternsproject.creational.singletone;

public class ThreadSafeSingleton2 {

    private static final ThreadSafeSingleton2 instance = new ThreadSafeSingleton2();

    private ThreadSafeSingleton2() {
    }

    public static ThreadSafeSingleton2 getInstance(){
        return instance;
    }
}
