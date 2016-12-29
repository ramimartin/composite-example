package com.ramimartin.patterns.templatemethod.algorithms;


import com.ramimartin.utils.ArrayToStringUtils;
import com.ramimartin.utils.SortAlgorithms;

final public class BubbleSortAndSquarePrintingAlgorithm extends AbstractArrayAlgorithm {
    @Override
    protected Integer[] sort(Integer[] array) {
        SortAlgorithms.BubbleSort(array);
        return array;
    }

    @Override
    protected String toString(Integer[] array) {
        return ArrayToStringUtils.toString(array, "[", "]", ",");
    }
}