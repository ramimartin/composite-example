package com.ramimartin.patterns.templatemethod.algorithms;


import org.apache.commons.lang3.RandomUtils;

public abstract class AbstractArrayAlgorithm {

    public String doStuff() {
        Integer[] originalArray = generateArray();
        Integer[] sortedArray = sort(originalArray);
        return toString(sortedArray);
    }

    private Integer[] generateArray() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomUtils.nextInt(0, 1000);
        }
        return array;
    }

    protected abstract Integer[] sort(Integer[] array);

    protected abstract String toString(Integer[] array);


}
