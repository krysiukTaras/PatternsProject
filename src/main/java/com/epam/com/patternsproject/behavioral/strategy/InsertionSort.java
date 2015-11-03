package com.epam.com.patternsproject.behavioral.strategy;

/**
 * Created by taras on 03.11.15.
 */
public class InsertionSort implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("sorting array using insertion sort strategy");
    }
}
