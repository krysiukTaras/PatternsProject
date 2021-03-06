package com.epam.com.patternsproject.creational.singletone;

public class ThreadSafeSingleton1 {

    private static ThreadSafeSingleton1 instance = null;

    private ThreadSafeSingleton1() {
    }

    public static ThreadSafeSingleton1 getInstance(){
        if (instance == null){

            synchronized (ThreadSafeSingleton1.class){
                if (instance==null){
                    instance = new ThreadSafeSingleton1();
                }
            }
        }
        return instance;
    }
}
