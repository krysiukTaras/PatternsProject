package com.epam.com.patternsproject.creational.singletone;


public class Processor {

    public Processor() {
        SimpleSingleton.getInstance().log("Process started");
    }

    public int countSum(int end) {
        int sum = 0;
        for (int i = 0; i <= end; ++i){
            sum+=i;
        }
        SimpleSingleton.getInstance().log("Calculated sum = " + sum);
        return sum;
    }
}
