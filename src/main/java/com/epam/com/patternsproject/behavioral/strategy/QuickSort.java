package com.epam.com.patternsproject.behavioral.strategy;

/**
 * Created by taras on 03.11.15.
 */
public class QuickSort implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("sorting array using quick sort strategy");
    }
}
